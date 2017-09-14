package regexpkg;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateIPAddress {
	
	public static void main(String[] args){
		
		Pattern p = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher m = p.matcher("10.1.24.123");
		System.out.println(m.find());
		
		
		m = p.matcher("10.1a.24.123");
		System.out.println(m.find());
		
		m = p.matcher("10.1111.24.123");
		System.out.println(m.find());
		
		
		m = p.matcher("10.111.24");
		System.out.println(m.find());
		
		m = p.matcher("10-111.24");
		System.out.println(m.find());
		
		
		
		
		
	}

}
