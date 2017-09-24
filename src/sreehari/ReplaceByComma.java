package sreehari;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReplaceByComma {

	public static void main(String[] args) {
	  	
	   	  try
		{
		  
	   		File file = new File("/Users/scheerla1/Downloads/prop//1ah.txt.sp");
	 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 		BufferedWriter bw = new BufferedWriter(fw);
	 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/emails/last/1ah"));
	 		String sCurrentLine;
	         int i =1;
	         String fifty="";
	        // bw.write("update user_tax_document set taxYear='1999' where taxYear=2016 and authId  in (");
	 		while ((sCurrentLine = br.readLine()) != null) {
	 			//System.out.println(sCurrentLine);
	 			fifty = fifty + sCurrentLine + ",";
	 			
	 			if (i%50 == 0) { 				
					bw.write(fifty+"\n\n\n");	
					fifty = "";
	 			}
	 			i++;
	 			
	 		}
	 		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	  }
	
}
