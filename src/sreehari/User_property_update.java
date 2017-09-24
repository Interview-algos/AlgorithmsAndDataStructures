package sreehari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class User_property_update {

	public static void main(String[] args) {
	  	
	   	  try
		{
		  
	   		File file = new File("/Users/scheerla1/Downloads/split/oms_prop.csv");
	 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 		BufferedWriter bw = new BufferedWriter(fw);
	 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/split/10perUser_ids"));
	 		String sCurrentLine;
	         int i =1;
	 		while ((sCurrentLine = br.readLine()) != null) {
	 			System.out.println(sCurrentLine);
				bw.write(sCurrentLine+"\n");	
	 			i++;
	 			
	 		}
	 		
	 		bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	  }
	
}
