package sreehari;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateVerify {

	public static void main(String[] args) {
        String afterRelease = "";
        int total = 0;
        int rec = 0;
        int nonrec = 0;
        int i =0;
 		String deleted="";
 		int delCount = 0;
		try{

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date date1;

            
    		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/hari.txt"));

  	   		File file = new File("/Users/scheerla1/Downloads/dq/rec1.txt");
	 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 		BufferedWriter bw = new BufferedWriter(fw);

	 		File file1 = new File("/Users/scheerla1/Downloads/dq/non-rec1.txt");
	 		FileWriter fw1 = new FileWriter(file1.getAbsoluteFile());
	 		BufferedWriter bw1 = new BufferedWriter(fw1);
	 		
	 		
    		String sCurrentLine;
    		while ((sCurrentLine = br.readLine()) != null) {
    			//System.out.println(sCurrentLine);
    			total = total +1;
    			if (sCurrentLine.contains("DELETED")) {
    				deleted=deleted + "\n" + sCurrentLine; 
        			delCount++;
    				continue;
				} else if ( sCurrentLine.contains("NOTEXIST") || sCurrentLine.contains("NOVALUE")) {
        			i++;
        			continue;
				}
    			
    			String timestamp = sCurrentLine.split(",")[2].replaceAll("\"", "");
    			
  //  			System.out.println(sCurrentLine);
    //			System.out.println(timestamp);
    			String mydate = timestamp.split("T")[0];
    			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    			Date startDate = (Date)formatter.parse(mydate);
    			
    			Date splunkDate = (Date)sdf.parse(sdf.format(startDate));	
    			Date lastLoginDate = (Date)sdf.parse(sCurrentLine.split(",")[6]);
    			
    	          if(lastLoginDate.compareTo(splunkDate)>=0){
    	                //System.out.println("splunkDate is after loginDate");
						bw.write(sCurrentLine + "\n");
						rec = rec + 1;
    	          } else {
						bw1.write(sCurrentLine + "\n");
						nonrec = nonrec + 1;

    	          }
    		}
    		
    		bw.close();
    		bw1.close();

    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("Total:" + total + " Rec:" + rec +" Non: " + nonrec +" Del:" + delCount + "Not_Exist:"+i);
		System.out.println("Deleted\n" + deleted);
	}
}
