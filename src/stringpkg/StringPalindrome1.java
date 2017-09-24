package stringpkg;

/**
 * Date 04/09/2016
 * 
 * @author Tushar Roy
 *
 *         Given a string, determine if it is a palindrome, considering only
 *         alphanumeric characters and ignoring cases. For example, "A man, a
 *         plan, a canal: Panama" is a palindrome. "race a car" is not a
 *         palindrome.
 * 
 *
 *         https://leetcode.com/problems/valid-palindrome/
 */
public class StringPalindrome1 {

	public static void main(String[] args) {

		String str1 = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		String str3 = "ma, la ya: lam";
		String str4 = "deed";
		String str5 = "dad";
		StringPalindrome1 stringPalindrome1 = new StringPalindrome1();
		stringPalindrome1.isPalindrome(str1);
		stringPalindrome1.isPalindrome(str2);
		stringPalindrome1.isPalindrome(str3);
		stringPalindrome1.isPalindrome(str4);
		stringPalindrome1.isPalindrome(str5);

	}

	/**
	 * To check if the string is palindrome or not
	 * 
	 * @param str
	 * @return
	 */
	public void isPalindrome(String str) {

		int start = 0;
		int end = str.length() - 1;
		boolean isPal = true;
		while (start < end) {
			while (!isAlphaNumeric(str.charAt(start))) {
				start++;
			} while (!isAlphaNumeric(str.charAt(end))) {
				end--;
			} 
				if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {

					isPal = false;
					break;
				}
			
			start++;
			end--;
	}

		if (isPal) {
			System.out.println("String is a plalindrome");
		} else {
			System.out.println("String is NOT a plalindrome");
		}
	}

	/**
	 * To check if the char is alphanumeric or not
	 * 
	 * @param ch
	 * @return
	 */
	public boolean isAlphaNumeric(char ch) {
		if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			return true;

		else
			return false;
	}

}
