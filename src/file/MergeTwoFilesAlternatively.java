package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeTwoFilesAlternatively {
	
	public static void main(String[] args) throws IOException {
		File ip1 = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ip1.txt");
		File ip2 = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ip2.txt");
		File result = new File("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/result.txt");
		
		FileReader fr1 = new FileReader(ip1);
		FileReader fr2 = new FileReader(ip2);
		FileWriter fw = new FileWriter(result);
		
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		
		String line1 = br1.readLine() ;
		String line2 = br2.readLine() ;
		while(line1 !=null || line2!=null){
			
			if(line1 !=null){
				bw.write(line1);
				bw.newLine();
				line1 = br1.readLine() ;
			}
			
			if(line2!=null){
				bw.write(line2);
				bw.newLine();
				line2 = br2.readLine() ;
			}
		}
		
		bw.flush();
		br1.close();
		br2.close();
		bw.close();
		
	}

}
