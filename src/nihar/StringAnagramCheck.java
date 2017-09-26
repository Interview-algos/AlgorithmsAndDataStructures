package nihar;

import java.util.Arrays;

public class StringAnagramCheck {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abcde";
		String str2 = "cbeda";
		int sum1 = 0;
		for (int i=0;i<str1.length();i++){
			sum1 = sum1 + str1.charAt(i);
		}
		
		int sum2 = 0;
		for (int i=0;i<str2.length();i++){
			sum2 = sum2 + str2.charAt(i);
		}
		
		System.out.println("Anagram " + (sum1==sum2));
		
		//2nd Method
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("Anagram " + Arrays.equals(arr1, arr2));
	}
}
