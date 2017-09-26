package nihar;

import java.util.HashSet;
import java.util.Set;

public class AnagramSubsetFind {

	public static void main(String arg[])
    {
    	String[] arr = {"bat", "tab" ,"abc","yzx","rat","tar","atb","xyz"};
    	printAnagramSubset(arr);
    }
	
	public static void printAnagramSubset(String[] arr){
		
		int[] tmpArr = new int[arr.length];
		
		for (int i=0;i<arr.length ;i++){
			String str = arr[i];			
			int ascii = 0;
			for (int j=0;j< str.length();j++){
				ascii = ascii + str.charAt(j);
			}
			tmpArr[i] = ascii;
		}
		
		Set<Integer> asciiSet = new HashSet<Integer>();
		for (int i : tmpArr){
			asciiSet.add(i);
		}
		
		for (int val: asciiSet){
			System.out.println("******");
			for (int j=0; j<tmpArr.length ;j++){
				if (tmpArr[j] == val){
					System.out.println(arr[j]);
				}
			}
			System.out.println("******");
		}
		
	}

}
