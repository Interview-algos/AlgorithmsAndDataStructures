package stringpkg;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstRepeatedCharacterInString {
	
	public static char firstRepeatedChar(String str){
		
		//LinkedHashMap maintains insertion order
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		char[] arr = str.toCharArray();
		for (char ch: arr){
			if (hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			else
				hm.put(ch, 1);
		}
		for (Entry<Character, Integer> m: hm.entrySet()){
			if ( m.getValue() > 1)
				return m.getKey();
		}
		throw new RuntimeException("didn't find any non repeated Character");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdeffghiija";
		System.out.println(firstRepeatedChar(str));
		
		str = "abbccdefghij";
		System.out.println(firstRepeatedChar(str));

	}

}
