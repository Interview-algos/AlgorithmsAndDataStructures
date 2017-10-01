package srihari;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TrimDeletedUsers {
	public static void main(String[] args) {
		String list="";
	    int empty =0;
		int i = 0;

	 	  try
		{
		  
	 		File file = new File("/Users/scheerla1/Downloads/dq/s1/7/sree7_del");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/s1/7/7	.txt"));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				String userEmail="";
				//System.out.println(sCurrentLine);
				if (sCurrentLine.contains("inserted")) {
					i++;
					continue;
				}
				if (sCurrentLine.contains("1000|") || sCurrentLine.contains("500|")) {
					System.out.println("Line num:" + i);
					 userEmail = sCurrentLine.split(":")[2];
				} else {
					userEmail= sCurrentLine.split(":")[1];
				}
				
				String email = userEmail.replaceAll("Failed", "").replaceAll("\\s+", "");
				i++;
			 	bw.write(email+"\n");
			}

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	 	  
	 	  System.out.println("Empty are:" + empty);
	}
}
