package sreehari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class AddPropertytoEmails {
public static void main(String[] args) {
	String list="";
    int empty =0;

 	  try
	{
	  
 		File file = new File("/Users/scheerla1/Downloads/split/user_prop_2.csv");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/split/today_users"));
		String sCurrentLine;
		while ((sCurrentLine = br.readLine()) != null) {
			//System.out.println(sCurrentLine);
			String userId = sCurrentLine;
	
 			bw.write(userId+ ",feature.minttotax.segment1,false" + "\n");
 			bw.write(userId+ ",feature.minttotax.segment2,false" + "\n");
 			bw.write(userId+ ",feature.minttotax.segment3,false" + "\n");

		 			bw.write(userId+ ",feature.minttotax.segment4,false" + "\n");

		}

		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	} 
 	  
 	  System.out.println("Empty are:" + empty);
}
}
