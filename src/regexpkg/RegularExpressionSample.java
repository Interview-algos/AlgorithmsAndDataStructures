package regexpkg;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressionSample {
	
	public static void main(String[] args){
		
		Pattern pattern = Pattern.compile("ge*");
		
		Matcher m = pattern.matcher("geeksforgeeks.org");
		
		while(m.find()){
			
			System.out.println("Start Index=>" + m.start());
			System.out.println("End Index=>"+ (m.end()-1));
		}
		
	}

}
