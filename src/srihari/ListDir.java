package srihari;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ListDir {
public static void main(String[] args) {
  	
 	  try
	{
	  
 	


File folder = new File("/Users/scheerla1/Downloads/dq/s2/2");
File[] listOfFiles = folder.listFiles();


BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/s2/2/2.txt"));
String sCurrentLine;
int i = 0;
//System.out.println(folder.toString());
while ((sCurrentLine = br.readLine()) != null) {
	if (sCurrentLine.contains("records inserted!")) {
		String fileName1 = sCurrentLine.split("\\|")[0];	
		String[] fileName = fileName1.split("\\\\");
		System.out.println(folder.toString() +"/" +fileName[6]);

		File file = new File(folder.toString() +"/" +fileName[6]);
		file.delete();

	}




}

		
		//bw.close();
	} catch (Exception e) {
		e.printStackTrace();
	} 
 	    
}
}
