package sreehari;


import java.io.BufferedReader;
import java.io.FileReader;


public class CountSuccess {
public static void main(String[] args) {
	int total=0;

 	  try
	{
	  
 	





BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/dq/s3/S3success_new"));
String sCurrentLine;
int i = 0;
//System.out.println(folder.toString());
while ((sCurrentLine = br.readLine()) != null) {
	if (sCurrentLine.endsWith("|0 records inserted!")) {
		continue;
	} else {
		String countLines = sCurrentLine.split("\\|")[5];	
		int value = Integer.parseInt(countLines.split("records")[0].trim());
		total = total + value;
	}
}

		
		//bw.close();
	} catch (Exception e) {
		e.printStackTrace();
	} 
 	  System.out.println("Total:" + total);  
}
}
