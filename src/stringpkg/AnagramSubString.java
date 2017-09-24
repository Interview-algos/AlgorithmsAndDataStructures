/**
 * NOT WORKING
 */

package stringpkg;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AnagramSubString {

	public static void main(String[] args) {

		String str1 = "geeksforgeeks";
		String str2 = "keefg";
		boolean isAnagram = false;

		char[] cStr1 = str1.toCharArray();
		char[] cStr2 = str2.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmCopy = new HashMap<Character, Integer>();

		for (int i = 0; i <= (cStr2.length - 1); i++) {

			if (hm.containsKey(cStr2[i])) {
				hm.put(cStr2[i], hm.get(cStr2[i]) + 1);
				hmCopy.put(cStr2[i], hmCopy.get(cStr2[i]) + 1);
			}

			else {
				hm.put(cStr2[i], 1);
				hmCopy.put(cStr2[i], 1);
			}

		}

		int index = 0;
		int i = 0;
		int j = 0;
		while(i<cStr1.length){
		for (j = 0; j <= cStr2.length - 1; j++) {

			if (hm.containsKey(cStr1[i]) && hm.get(cStr1[i])!=0) {
				hm.put(cStr1[i], hm.get(cStr1[i]) - 1);
			}
			i++; 
		}
			isAnagram = checkAnagram(hm);
			if (isAnagram) {
				System.out.println("its Anagram");
				break ;

			}
			else{
				hm = hmCopy;
				i = index + 1;
				index++;
			}
		}

		if(!isAnagram){
			System.out.println("its NOT Anagram");
		}

	}



	public static boolean checkAnagram(HashMap<Character, Integer> hm){
		Set<Character> keys = hm.keySet();
		boolean isAnagram = false ;
		for (char k : keys) {
			if (hm.get(k) != 0) {
				isAnagram = false;
				break;
			}

			else {
				isAnagram = true;
				

			}
			
			
		}
		return isAnagram ;
	}	
	}
