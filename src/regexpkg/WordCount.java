package regexpkg;

import java.util.regex.Pattern;

public class WordCount {
	
	
	public static void main(String[] args){
		
		String str = "One two       three\n four\tfive,Six.seven  ";
		Pattern  p = Pattern.compile("(\\s|\\t|\\n|,|\\.)+");
		
		String[] a = p.split(str) ;
		for(String s : a){
			
			System.out.println(s);
		}
		System.out.println(a.length);
	}

}
