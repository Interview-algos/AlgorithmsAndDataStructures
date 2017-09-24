package sreehari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class DeleteDUPsFromFile {
	 public static void main(String[] args) throws IOException
	 
	 
	    {
		 String allFiles="";
		 	File folder = new File("/Users/scheerla1/Downloads/dq/s3/1");
		 	
	        File failed = new File("/Users/scheerla1/Downloads/dq/s3/1/1.txt");
	        BufferedReader failreader = new BufferedReader(new FileReader(failed));

	        String failedRow;
	        String fileName = "";
	        String removingLine="";
	        

	        while ((failedRow = failreader.readLine()) != null) {
	        	if (failedRow.contains("records inserted!")) {
	        		continue;
	        	} else if (failedRow.startsWith("User not found in line")) {
	        		removingLine = failedRow.split(":")[1].split("\\|")[0].trim();
	        	} else if (failedRow.contains("Error in line")) {
					removingLine=",feature.minttotax.segment3,true";
					if (failedRow.contains("csv")) {
						String[] sep = failedRow.split("\\|")[0].split("\\\\");
						fileName=failedRow.split("\\|")[0].split("\\\\")[6];	
					}
	        		
				}else {
	        		removingLine = failedRow.split(":")[2].split("\\|")[0].trim();
	        		String[] sep = failedRow.split("\\|")[0].split("\\\\");
	        		fileName=failedRow.split("\\|")[0].split("\\\\")[6];
	        	}

	        	//System.out.println(folder.toString()+"/"+fileName);
	        	File inputFile = new File(folder.toString()+"/"+fileName);
	        	File tempFile = new File(folder.toString()+"/"+fileName+"_temp");

	        	BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	        	BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	        	String currentLine;
	        	int i =0;
	        	while((currentLine = reader.readLine()) != null) {
	        		if(!currentLine.equalsIgnoreCase(removingLine)){
	        			writer.write(currentLine + System.getProperty("line.separator"));
	        		} else {
	        			System.out.println(removingLine);
	        			//allFiles=allFiles +  " " +fileName +" ";
	        		}
	        	}
	        	writer.close(); 
	        	reader.close(); 
	            boolean successful = tempFile.renameTo(inputFile);
	            System.out.println(allFiles);
	        }
	    }
}
