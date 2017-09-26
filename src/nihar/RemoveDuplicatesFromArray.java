package nihar;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,4,5,6};
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		for (int i=0; i<arr.length ;i++){
			hs.add(arr[i]);
		}

		System.out.println(hs);
		
		//2nd method Without using Collection class
		
		int[] arr1 = {1,2,3,4,2,4,5,6};
		int[] result = new int[arr1.length];
		
		Arrays.sort(arr1);
		
		result[0] = arr1[0];
		int previous = arr1[0];
		
		for (int i=0; i<arr1.length; i++){
			if (arr1[i]!=previous)
				result[i]=arr1[i];
			previous = arr1[i];
		}
		
		for(int i: result)
			System.out.print(i+" ");				
	}
}
