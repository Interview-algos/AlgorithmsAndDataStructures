package regexpkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmailAddress {
	
	public static void main(String[] args){
		
		System.out.println("is valid ?" + validateEmail("cbrajendra@gmail.com"));
		System.out.println("is valid ?" + validateEmail("cbr@gmail.com"));
		System.out.println("is valid ?" + validateEmail("cr@gmail.com"));
		System.out.println("is valid ?" + validateEmail("cr_@gmail.com"));
		System.out.println("is valid ?" + validateEmail("cr-@gmail.com"));
		System.out.println("is valid ?" + validateEmail("cr!@gmail.com"));
		System.out.println("is valid ?" + validateEmail("crbgmail.com"));
		System.out.println("is valid ?" + validateEmail("crb@gm.com"));
		System.out.println("is valid ?" + validateEmail("cbrajendra@gmaild.com"));
		System.out.println("is valid ?" + validateEmail("CBRAJENDRA@gmail.com"));
		System.out.println("is valid ?" + validateEmail("CBRAJENDRA@gmailcom"));
		System.out.println("is valid ?" + validateEmail("cbrajendra@gmail.co"));
		System.out.println("is valid ?" + validateEmail("cbrajendra@gmail.c"));
		
		
	}
	
	
	
	public static boolean validateEmail(String emailid){
		
		Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,10}\\@[a-z]{3,5}\\.[a-z]{2,3}$");
		Matcher m = p.matcher(emailid);
		return m.find();
	}

}
