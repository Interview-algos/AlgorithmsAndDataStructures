/**
 * Given a string e.g. ABCDAABCD. Shuffle he string so that no two smilar letters together. 
E.g. AABC can be shuffled as ABAC.
 */





// Not working code


package stringpkg;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NoTwoCharTogether {
	
	public static void main(String[] args) {
		String a = "AAAABBCCCCDAABCDDD";
		char str[] = a.toCharArray() ;
		shuffle(str);
		
	}
	
	
	public static void shuffle(char[] a){
	
	

		for (int i = 0; i < a.length-1; i++) {

			if (a[i] == a [i+1]) {
		  	char temp;
			if (i != a.length-2){
		    	 temp = a[i+2];
					a[i+2] = a[i+1];
					a[i+1] = temp;
		    }
		    else{
		    	 temp = a[i+1];
					a[i+1] = a[0];
					a[0] = temp;
		      i=0;
		    }
		  }
		}
		
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]);
		}
		
	        
	}

	
	
	
}
