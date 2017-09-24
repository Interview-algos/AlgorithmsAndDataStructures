package regexpkg;

import java.util.regex.Pattern;

public class ReverseWords {
	
	public static void main(String[] args){
		
		String str = "I am   cool";
		System.out.println("Original String:"+ str + ":");
		String[] tokens = tokenize(str);
		StringBuilder strBuilder = new StringBuilder() ;
		int len = tokens.length ; 
		for(int i=len-1 ; i>=0 ;i--)
		{
			strBuilder = strBuilder.append(tokens[i]).append(" ") ;
		}
		System.out.println("reverse String:" + strBuilder + ":");
	}
	
	
	
	public static String[] tokenize(String str){
		
		Pattern p = Pattern.compile("\\s");
		String[] tokens = p.split(str);
		
		for(String token : tokens){
			
			System.out.println(token);
		}
		return tokens ;
	}
	
	
	
	

}
