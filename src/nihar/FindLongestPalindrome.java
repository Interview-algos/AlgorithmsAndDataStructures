package nihar;

public class FindLongestPalindrome {

	public static boolean isPalindrom(String str){
		boolean palindrome = false;
		int endIndex = str.length()-1;
		for (int i=0; i<str.length()/2; i++){
			if (str.charAt(i) == str.charAt(endIndex)){
				palindrome = true;
				endIndex--;
			}else{
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}
	
	public static String longestPalindrome(String str){
		String longestPalindome = "";
		
		for (int i=0; i< str.length(); i++){
			for (int j=str.length()-1; j>=0 && j!=i; j--){
				if (isPalindrom(str.substring(i, j))){
					String palindrome = str.substring(i,j);
					if (palindrome.length() > longestPalindome.length())
						longestPalindome = palindrome;
				}
			}
		}
		return longestPalindome;
	}
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("forgeeksskeegfor"));
	}

}
