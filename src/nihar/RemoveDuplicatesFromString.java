package nihar;

import java.util.TreeSet;

public class RemoveDuplicatesFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabcded";
		char[] charray = str.toCharArray();
		
		TreeSet<Character> hs = new TreeSet<Character>();
		StringBuffer sb = new StringBuffer();
		
		for (char ch : charray){
			if (hs.add(ch))
				sb.append(ch);
		}
		
		System.out.println(sb.toString());

	}

}
