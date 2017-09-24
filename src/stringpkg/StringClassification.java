package stringpkg;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * i/p  = 1a2b3c4d5e6f7g8h9iAjBkClDmEn
 * o/p = 123456789ABCDEabcdefghijklmn
 * @author rkumar1
 *
 */

public class StringClassification {
	
	public static void main(String[] a){
		
		String str1 = "1a2b3c4d5e6f7g8h9iAjBkClDmEn" ;
		char[] cStr1 = str1.toCharArray();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i< cStr1.length ;i++){
			ts.add((int)cStr1[i]);
		}
		
		Iterator<Integer> itr = ts.iterator() ;
		while(itr.hasNext()){
			System.out.print(Character.toChars(itr.next()));
		}
		
		
		
		
	}

}
