package srihari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FindAuthIds {
public static void main(String[] args) {
    int i =0;

 	  try
	{
	  
 		File file = new File("/Users/scheerla1/Desktop/tax/authIds1");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		String sCurrentLine;
       String dirName = "/Users/scheerla1/Desktop/tax/data/minttotax/WIPDir";
       File folder = new File(dirName);
       File[] listOfFiles = folder.listFiles();

       for (File fileDir : listOfFiles) {
    	    if (file.isFile()) {
    			BufferedReader br = new BufferedReader(new FileReader(dirName+"/" +fileDir.getName()));
    			while ((sCurrentLine = br.readLine()) != null) {
    				//System.out.println(sCurrentLine);
    			 			//bw.write(i + "," + sCurrentLine+  "\n");
    				 String[] tuple = sCurrentLine.split(",");
    				 for (String string : tuple) {
    					if (string.contains("authId")) {
    						String auth = string.split(":")[1];
    						System.out.println("Auth" + auth);
    						bw.write(auth+"\n");
    	    				i++;
    					}
    				}
    				
    			}

    	    }
       }
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	} 
 	    System.out.println("I val " +i);
}
}
