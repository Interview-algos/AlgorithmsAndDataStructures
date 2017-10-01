package srihari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FindNonCommonAuthIds {

	public static void main(String[] args) {
	  	
	   	  try
		{
		  
	   		File file = new File("/Users/scheerla1/Downloads/dq/mint2tax/errordocs");
	 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 		BufferedWriter bw = new BufferedWriter(fw);
	 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/mint2tax/non-common"));
	 		String sCurrentLine;
	         int i =1;
	 		while ((sCurrentLine = br.readLine()) != null) {
	 			//System.out.println(sCurrentLine);
					String authId = sCurrentLine;
			 		BufferedReader br1 = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/mint2tax/non-support"));
			 		String sCurrentLine1;
			 		int found=0;
			 		while ((sCurrentLine1 = br1.readLine()) != null) {
			 				if (sCurrentLine1.contains(authId)) {
								//bw.write(sCurrentLine + "\n");
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
