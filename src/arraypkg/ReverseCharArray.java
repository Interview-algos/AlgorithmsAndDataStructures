package arraypkg;

/*
 * Reverse a char array without using a second array
 * Q1. Given array a[]={'a','n','u','b','h','a','v'} 
You have to generate a[]={'v','a','h','b','u','n','a'} in the same array with space complexity O(1). You may use just one bit extra. 

Q2. perform the same operation with the same constraints for 
array a[]={'m','y',' ','n','a','m','e',' ','i','s',' ','a','n','u','b','h','a','v'} 

Q3 Perform the same operation with same contraints to arrange the words in alphabetic order, ie the output array should be: 
a[]={'a','n','u','b','h','a','v',' ','i','s',' ','m','y',' ','n','a','m','e'}
 */
public class ReverseCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = new char[]{'m','y',' ','n','a','m','e',' ','i','s',' ','a','n','u','b','h','a','v'} ;
		
		int l = chars.length - 1;
		
		for (int j=0; j<chars.length ; j++){
			System.out.print(chars[j]);
		}
		
		System.out.println();
		
		for (int i=0; i<=l/2; i++){
			char tmp = chars[l-i];
			chars[l-i] = chars[i];
			chars[i] = tmp;
		}
						
		for (int j=0; j<chars.length ; j++){
			System.out.print(chars[j]);
		}		
	}
}
