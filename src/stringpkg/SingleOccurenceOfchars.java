/**
 * print all the characters present in the given string only once in a reverse order. Time & Space complexity should not be more than O(N).
 * 
 *  
 *  e.g. 
1)Given a string aabdceaaabbbcd 
the output should be - dcbae 

2)Sample String - aaaabbcddddccbbdaaeee 
Output - eadbc 

3)I/P - aaafffcccddaabbeeddhhhaaabbccddaaaa 
O/P - adcbhef 
 */


package stringpkg;

public class SingleOccurenceOfchars {
	
	
	public static void main(String[] args) {
		
		String str = "aaafffcccddaabbeeddhhhaaabbccddaaaa";
		singleoccurence(str);
		
	}
	
	public static void singleoccurence(String str){
		
		StringBuilder strBuilder = new StringBuilder();
		char[] strArr = str.toCharArray() ;
		int len = strArr.length -1 ;
		strBuilder =  strBuilder.append(strArr[len-1]); ;
		for(int i=len; i>=0; i--){
			
			
			if(!strBuilder.toString().contains(str.substring(i, i+1)))
				 strBuilder.append(strArr[i]);
			
			
		}
		
		System.out.println(strBuilder.toString());
		
	}


}
