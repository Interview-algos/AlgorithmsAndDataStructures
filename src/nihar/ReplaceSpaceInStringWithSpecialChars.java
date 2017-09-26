package nihar;

public class ReplaceSpaceInStringWithSpecialChars {

	public static String replace(String str) {
		
	    String[] words = str.split(" ");
	    StringBuilder sentence = new StringBuilder(words[0]);

	    for (int i = 1; i < words.length; ++i) {
	        sentence.append("%20");
	        sentence.append(words[i]);
	    }

	    return sentence.toString();
	}
	
	public static String replaceSecondMethod(String str){
		char arr[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (char ch: arr){
			if (ch == ' ')
				sb.append("%20");
			else
				sb.append(ch);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(replace("hello world Nihar"));
		System.out.println(replaceSecondMethod("hello world Nihar"));

	}

}
