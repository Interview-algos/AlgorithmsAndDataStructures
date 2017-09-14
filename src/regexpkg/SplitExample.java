	package regexpkg;

import java.util.regex.Pattern;

public class SplitExample {
	
	public static void main(String[] str){
		
		
		String text = "geeks1for2geeks3";
		Pattern pattern = Pattern.compile("\\d",Pattern.CASE_INSENSITIVE);
		
		String[] result = pattern.split(text);
		
		for(String res : result){
			System.out.println(res);
		}
		
		
	}

}
