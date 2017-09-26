package nihar;

//import static org.testng.Assert.*;

public class RemoveGivenCharacterFromString {

	public static String removeChar(String str, char c){
		
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		
		for (char ch: arr){
			if (ch!=c)
				sb.append(ch);
		}
		return sb.toString();
		
	}
	
	public static String stripChars1(String input, String strip) {
	    StringBuilder result = new StringBuilder();
	    char[] arr = input.toCharArray();
	    for (char c : arr) {
	        if (strip.indexOf(c) == -1) {
	            result.append(c);
	        }
	    }
	    return result.toString();
	}
	
	public static String stripChars2(String input, String strip) {
	
		char[] ca = strip.toCharArray();
		for (char c: ca){
			input = input.replaceAll(""+c, "");
		}
	    return input;
	}
	
	public static void main(String[] args) {
		
		String strip = "sa";
		String input = "Just to clarify, I will have strings of varying "
				      + "lengths. I want to strip characters from it, the exact "
				      + "ones to be determined at runtime, and return the "
				      + "resulting string.";
			
		input = stripChars2(input,strip);
		System.out.println(input);	
		
		System.out.println("After remove: " + removeChar("aaaa", 'a'));
		System.out.println("After remove: " + removeChar("abc", 'b'));
		
	//	assertEquals(removeChar("aaaa", 'a'), "");
		//assertEquals(removeChar("abc", 'b'), "ac");
	
	}
	
	

}
