package nihar;

import java.util.HashMap;
import java.util.Map;

public class FindMaxPalindromeLength {

	public static int maxLengthPalindrome(String s) {
	    char[] sArr = s.toCharArray();
	    HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); 

	    for (int i = 0; i < sArr.length; i++) {
	      char ch = sArr[i];
	      if (hm.containsKey(ch)) {
	    	  hm.put(ch, hm.get(ch) + 1);
	      } else {
	    	  hm.put(ch, 1);
	      }
	    }
	    
	    int maxPal = 0;
	    int maxOdd = 0;
	    for (Map.Entry<Character, Integer> m : hm.entrySet()) {
	      int count = m.getValue();
	      if (count % 2 == 0) {
	        maxPal += count;
	      } else if (count > maxOdd) {
	        maxOdd = count;
	      }
	    }
	    System.out.println(maxPal + " " + maxOdd);
	    return maxPal + maxOdd;
	  }
	
	public static void main(String[] args) {
		
		System.out.println(maxLengthPalindrome("ajandnfdbafkdrfbla"));

	}

}
