package nihar;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindHighestOccuredCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbcccchhhhhaa";
		char[] arr = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c: arr){
			
			if (hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}else{
				hm.put(c, 1);
			}
		}
		int maxOccurence = 0;
		char key = 0;
		
		for(Entry<Character, Integer> e: hm.entrySet()){
			int occurence = e.getValue();
			if (occurence > maxOccurence){
				maxOccurence = occurence;
				key = e.getKey();
			}
		}
		
		System.out.println("Char "+ key + ": " + maxOccurence);
		
	}

}
