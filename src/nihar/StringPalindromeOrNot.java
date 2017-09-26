package nihar;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MnbpoopbnM";
		int endIndex = str.length()-1;
		boolean palindrome = false;
		for (int i=0; i< str.length()/2; i++){
			if (str.charAt(i) == str.charAt(endIndex)){
				palindrome = true;
				endIndex--;
			}else{
				palindrome = false;
				break;
			}	
		}		
		System.out.println(palindrome);
	}
}
