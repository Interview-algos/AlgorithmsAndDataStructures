package nihar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class FindTwoLinesWithMaxCharsCount {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("MyTestFile.txt");
		BufferedReader br = new BufferedReader(fr);
		TreeMap<Integer,String> tm = new TreeMap<>();
		String line = null;
		while ((line = br.readLine()) != null){
			line = line.trim();
			tm.put(line.length(), line);
		}
		int count = 0;
		NavigableMap<Integer, String> descMap = tm.descendingMap();
		
		for(Map.Entry<Integer,String> m: descMap.entrySet()){
			System.out.println(m.getKey() + " : " + m.getValue());
			count++;
			if (count > 1)
				break;
		}
		fr.close();
	}

}
