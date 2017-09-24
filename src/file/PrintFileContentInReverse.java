package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintFileContentInReverse {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ReadFromFile.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine() ;
		StringBuffer revLine = new StringBuffer() ;
		while(line != null){
			for(int i=(line.length()-1); i>=0;i--){
				
				revLine.append(line.charAt(i));
			}
			
			
			line = br.readLine() ;
			
		}
		System.out.println(revLine);
		fr.close();
		br.close();
	}

}
