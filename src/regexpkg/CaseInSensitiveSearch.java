package regexpkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseInSensitiveSearch {
	
	
	public static void main(String[] args){
		
		Pattern pattern = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);
		
		Matcher m = pattern.matcher("GeeksForGeeks.org");
		
		while(m.find()){
			
			System.out.println("Start Index=>"+m.start());
			System.out.println("EndIndex=>"+ (m.end()-1));
		}
		
		
		
	}

}
