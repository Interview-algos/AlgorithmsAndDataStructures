package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {

		String fileName = "/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ReadFromFile.txt";
		ReadFromFile rff = new ReadFromFile();

		rff.bufferedReaderDemo(fileName);
		// rff.fileReaderDemo();

	}

	// BufferedReader method
	public void bufferedReaderDemo(String fileName) throws IOException {
		String st;
		File file = new File(fileName);
		File wfile = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/WriteToFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(wfile));
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			bw.append(st);
			bw.newLine();
			
		}
		
		bw.close();
		
	}

	

}