package srihari;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatChar("reehari"));
	}
	
	public static char firstNonRepeatChar(String s) {
		Map<Character, Integer> linkedMap = new LinkedHashMap<>();
		char[] charArr = s.toCharArray();
		
		for(char c: charArr) {
			if (linkedMap.containsKey(c)) {
				linkedMap.put(c, linkedMap.get(c)+1);
			} else {
				linkedMap.put(c, 1);				
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = linkedMap.entrySet();
		
		for(Entry<Character, Integer> entry: entrySet) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
        throw new RuntimeException("didn't find any non repeated Character");

	}
}
