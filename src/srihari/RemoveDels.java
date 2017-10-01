package srihari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class RemoveDels {

	public static void main(String[] args) {
	  	
	   	  try
		{
		  
	   		File file = new File("/Users/scheerla1/Downloads/dq/s1/7/1ag_final");
	 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 		BufferedWriter bw = new BufferedWriter(fw);
	 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/s1/7/1ag"));
	 		String sCurrentLine;
	         int i =1;
	 		while ((sCurrentLine = br.readLine()) != null) {
	 			//System.out.println(sCurrentLine);
					String authId = sCurrentLine;
			 		BufferedReader br1 = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/s1/7/sree7_del"));
			 		String sCurrentLine1;
			 		int found=0;
			 		while ((sCurrentLine1 = br1.readLine()) != null) {
			 			   String authId1 = sCurrentLine1;
			 				if (authId1.equals(authId)) {
			 					//String latest = sCurrentLine1.split(",")[1];
								//bw.write(sCurrentLine+"," + latest + "\n");
			 					found =1;
								break;
							} 
			 		}
			 		if (found == 0) {
			 			bw.write(sCurrentLine+  "\n");
					}
	 			i++;
	 			
	 		}

	 		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	  }
	
}
