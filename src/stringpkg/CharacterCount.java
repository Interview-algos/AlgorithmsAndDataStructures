package stringpkg;

import java.util.HashMap;

public class CharacterCount {
	public static void main(String[] args) {
	String var = "SREEHARI SREEHARI";
	
	HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	char[] chars = var.toCharArray();
	for (int i = 0; i < chars.length; i++) {
		if (count.containsKey(chars[i])) {
			 count.put(chars[i], count.get(chars[i]) + 1);
		} else {
			count.put(chars[i], 1);
		}
	} 
	
	for (Character c: count.keySet()) {
		System.out.println(c + ":" + count.get(c));
	}
	
	
			
	 
	}
}
