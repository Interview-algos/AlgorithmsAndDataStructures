package stringpkg;

import java.util.HashMap;
import java.util.Map.Entry;



/*
 * Write a program to test whether a string and all strings that can be 
 * made using the characters of that string are palindrome or not.
 */

public class StringPalindromCheck {
	
	public static boolean checkPalindrom(String str){
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i=0;i<str.length(); i++){
			
			if (!hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), 1);
			}else{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		
		int count = 0;
		
		for (Entry<Character,Integer> m: hm.entrySet()){
			
			if (m.getValue() %2 == 1)
					count++;				
		}
		if (count > 1)
			return false;
		else
			return true;		
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkPalindrom("mmo"));
		System.out.println(checkPalindrom("momo"));
		System.out.println(checkPalindrom("yakak"));
		System.out.println(checkPalindrom("mmooug"));
		System.out.println(checkPalindrom("mmooog"));
		System.out.println(checkPalindrom("mmmooogghh"));
		
	}

}
