package nihar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This program finds all the digits in a string and sums it up including -ve numbers
 */

public class JavaRegxDemo {

	public static void findnumbers(String str){
		
		Pattern p = Pattern.compile("[-][0-9]|[0-9]");
		Matcher m = p.matcher(str);
		int sum = 0;
		while (m.find()){
			System.out.println(m.group());
			sum = sum + Integer.parseInt(m.group());
			
		}
		System.out.println("Sum is " + sum);
	}
	
	/*
	 * Write a regular expression which matches a text line 
	 * if this text line contains either the word "Joe" or the word "Jim" or both
	 */
	public static boolean checkWordPresent(String str){
		
		Pattern p = Pattern.compile(".*(Joe|Jim)|(joe|jim).*");
		Matcher m = p.matcher(str);
		if (m.find())
			return true;
		else
			return false;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findnumbers("Nihr8-3s8-3s8sjn2229sja");
		System.out.println(checkWordPresent("humbapumpa Jim"));
		
	}

}
