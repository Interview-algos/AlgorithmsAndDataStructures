package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class DeleteDuplicateLines {
	
	public static void main(String[] args) throws IOException {
		File ip = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ip1.txt");
		File op = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/op1.txt");
		
		FileReader fr = new FileReader(ip);
		FileWriter fw = new FileWriter(op);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		HashSet<String> hs = new HashSet();
		String s ;
		while((s=br.readLine())!=null){
			
			if(hs.add(s)){
				bw.write(s);
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
	}

}
