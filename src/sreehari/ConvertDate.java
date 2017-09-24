package sreehari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;


public class ConvertDate {

	public static void main(String[] args) throws ParseException {
	  	  try
			{
			  
		   		File file = new File("/Users/scheerla1/Downloads/dq/mint2tax/notexist.txt");
		 		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		 		BufferedWriter bw = new BufferedWriter(fw);
		 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/mint2tax/notexist"));
		 		String sCurrentLine;
		         int i =1;
		         String authid="";
		 		while ((sCurrentLine = br.readLine()) != null) {
		 			 authid=authid + "," +sCurrentLine;
					bw.write(authid );
					i++;
					
					if (i%100 == 0) {
						
						System.out.println(authid);
						authid="";
						System.out.println("\n\n\n\n\n\n\n");

					}
		 		}
		 		bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 

		  }
		
		
}

