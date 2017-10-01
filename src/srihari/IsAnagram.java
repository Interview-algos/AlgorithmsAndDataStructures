package srihari;

import java.util.Arrays;

public class IsAnagram {

	public boolean isAnag(String a1, String a2) {
		char[] ac = a1.toCharArray();
		StringBuilder sb = new StringBuilder(a2);
		for (Character c: ac) {
			int index= sb.indexOf("" + c);
			
			if (index != -1) {
				sb.deleteCharAt(index);
			}
		}
		
		if (sb.length() == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isAnagram2(String a1, String a2) {
		char[] c1 = a1.toCharArray();
		char[] c2 = a2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
		
	}
	public static void main(String[] args) {
		IsAnagram an = new IsAnagram();
		System.out.println(an.isAnag("abc", "acb"));
		//System.out.println(an.isAnagram2("abc", "acb"));
	}
}
