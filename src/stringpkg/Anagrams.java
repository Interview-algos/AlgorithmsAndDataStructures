package stringpkg;

public class Anagrams {

	public static void main(String[] args) {
		// String str1 = "geeksforgeeks" ;
		// String str2 = "forgeeksgeeks";

		// String str1 = "abdgacb" ;
		// String str2 = "abcbgaf";

//		String str1 = "daniel clowes";
//		String str2 = "enid coleslaw";
		//String str2 = "nad";
		
		String str1 = "geeksforgeeks";
		String str2 = "kesegofrkeseg";

		System.out.println(isAnagram1(str1, str2));
		System.out.println(isAnagram2(str1, str2));

	}

	/**
	 * Approach 1
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static boolean isAnagram1(String a1, String a2) {
		char[] ac = a1.toCharArray();
		StringBuilder sb = new StringBuilder(a2);
		for (Character c : ac) {
			//int index = sb.indexOf("" + c);
			int index = sb.indexOf(c.toString());
			if (index != -1) {
				sb.deleteCharAt(index);
			}
		}

		if (sb.length() == 0) {
			return true;
		}

		return false;
	}

	/**
	 * Approach 2
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagram2(String str1, String str2) {

		int sum1 = 0;
		int sum2 = 0;
		int asciiValue = 0;
		boolean isAnagram = true;

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		int asciiArr1[] = new int[256];
		int asciiArr2[] = new int[256];

		for (char c : charArr1) {
			asciiArr1[c]++;
		}

		for (char c : charArr2) {
			asciiArr2[c]++;
		}

		for (int i = 0; i < asciiArr1.length - 1; i++) {
			if (asciiArr1[i] != asciiArr2[i]) {
				isAnagram = false;
				break;
			}

		}
		return isAnagram;

		// if(isAnagram==false){
		// System.out.println("Both String are not Anagram");
		// }
		// else{
		// System.out.println("Strings are Anagram");
		// }
	}
}