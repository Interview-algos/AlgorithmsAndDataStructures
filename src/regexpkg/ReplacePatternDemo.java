package regexpkg;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReplacePatternDemo {
	
	public static void main(String args[]){
		
		String str = "My      Name      is      khan" ;
		replace(str, " ");
		
	}
	
	
	public static void replace(String str, String replace){
		
		Pattern p = Pattern.compile("\\s+");
		Matcher m = p.matcher(str);
		String newStr = m.replaceAll(replace);
		System.out.println(newStr);
		
	}

}
