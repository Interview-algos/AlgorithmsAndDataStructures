package srihari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ExtractValue {

	public static void main(String[] args) {
	  	
	   	  try
		{
		  
	   		File file = new File("/Users/scheerla1/Downloads/split/today_users");
	 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 		BufferedWriter bw = new BufferedWriter(fw);
	 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/split/today"));
	 		String sCurrentLine;
	         int i =1;
	 		while ((sCurrentLine = br.readLine()) != null) {
	 			System.out.println(sCurrentLine);
	 			if (sCurrentLine.contains("NOTEXIST") || sCurrentLine.contains("NOVAL")) {
					continue;
				}
				bw.write(sCurrentLine.split(",")[3]+"\n");	
	 			i++;
	 			
	 		}
	 		
	 		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	  }
	
}
