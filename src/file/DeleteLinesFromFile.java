package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class DeleteLinesFromFile {
	
	public static void main(String[] args) throws IOException {
		
		File ip1 = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ip3.txt");
		File ip2 = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ip4.txt");
		File op = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/op2.txt");
		
		FileReader fr1 = new FileReader(ip1);
		FileReader fr2 = new FileReader(ip2);
		FileWriter fw = new FileWriter(op);
		
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		HashSet<String> hs = new HashSet<String>();
		while((s=br2.readLine())!= null){
			hs.add(s);
		}
		
		String line = br1.readLine() ;
		while(line!= null){
			
			if(!hs.contains(line)){
				bw.write(line);
				
			}
			line = br1.readLine();
		}
		
		bw.flush();
		bw.close();
	}

}
