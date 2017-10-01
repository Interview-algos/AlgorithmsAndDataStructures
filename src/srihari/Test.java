package srihari;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Test {

	public static void main(String[] args) {
	  	  try
	  	{
	  	  
	        File file = new File("/Users/scheerla1/Desktop/vmp.txt");
	  		FileWriter fw = new FileWriter(file.getAbsoluteFile());
	  		BufferedWriter bw = new BufferedWriter(fw);
	  		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Desktop/vmp"));
	  		String sCurrentLine;
	          int i =1;
	  		while ((sCurrentLine = br.readLine()) != null) {
	  			//System.out.println(sCurrentLine);
//	  			String text =  login.getLastLogin(sCurrentLine)+"\n";
	//  			System.out.println("CCUSER IDa" + i + ":" + text);
	  			i++;
	  //			bw.write(text);
	  		}

	  		bw.close();
	  	} catch (IOException e) {
	  		e.printStackTrace();
	  	} 
	}
}
