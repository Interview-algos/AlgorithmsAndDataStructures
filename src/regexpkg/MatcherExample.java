package regexpkg;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


/*
 * // A Simple Java program to demonstrate working of
// String matching in Java
 */
public class MatcherExample {
	
	public static void main(String[] args){
		
		 // Create a pattern to be searched
		Pattern pattern = Pattern.compile("geeks");
		
		
		// Search above pattern in "geeksforgeeks.org"
		Matcher m = pattern.matcher("geeksforgeeks.org");
		
		
		 // Print starting and ending indexes of the pattern
        // in text
		while(m.find()){
			
			System.out.println("Start index =>" + m.start());
			System.out.println("End index=>" + (m.end()-1));
		}
		
		
	}

}
