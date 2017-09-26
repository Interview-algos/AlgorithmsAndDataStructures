package nihar;

import java.util.Map;
import java.util.TreeMap;

public class StringCompress {

	public static String compress(String str){
		
		TreeMap<Character,Integer> hm = new TreeMap<>();
		
		for (int i=0; i<= str.length()-1; i++){
			if (!hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i), 1);
			else
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
		}
		StringBuilder compress = new StringBuilder();
		for (Map.Entry<Character, Integer> m: hm.entrySet()){
			compress.append(m.getKey()).append(m.getValue().toString());
		}
			
		return compress.toString();
	}
	public static void main(String[] args) {
		System.out.println(compress("aaabbbccddeee")); //a3b3c2d2e3

	}

}
