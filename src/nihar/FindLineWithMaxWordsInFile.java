package nihar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FindLineWithMaxWordsInFile {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("MyTestFile.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> lines = new ArrayList<String>();
		int maxCount = 0;
		int count = 0;
		String line = null;
		while ((line = br.readLine()) != null ){
			String[] arr = line.split("\\s");
			count = arr.length;
			if (count > maxCount){
				maxCount = count;
				lines.clear();
				lines.add(line);
			}else if (count == maxCount){
				lines.add(line);
			}
		}
		fr.close();
		System.out.println(lines + " " + maxCount);

	}

}
