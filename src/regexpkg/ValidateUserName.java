package regexpkg;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateUserName {

	public static void main(String[] args){
		
		System.out.println("is 'java2novice' a valid username ? " + validateUserName("java2novice"));
		System.out.println("is 'java2novice_' a valid username ? " + validateUserName("java2novice_"));
		System.out.println("is 'java2novice_1234567800' a valid username ? " + validateUserName("java2novice_1234567800"));
		System.out.println("is 'java2-novice' a valid username ? " + validateUserName("java2-novice"));
		System.out.println("is 'java2.novice' a valid username ? " + validateUserName("java2.novice"));
		System.out.println("is 'JAVA2.NOVICE' a valid username ? " + validateUserName("JAVA2.NOVICE"));
	}
	
	
	public static Boolean validateUserName(String userName){
		
		Pattern p = Pattern.compile("^[a-z0-9_-]{6,14}$");
		Matcher m = p.matcher(userName);
		return m.find();
		
	}
}
