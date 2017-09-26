package nihar;

import java.util.HashSet;

public class FindDuplicateElementinSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,3,4,5,6,7,8,9};
		
		int arraysum = 0;
		
		for(int i=0; i<arr.length ; i++){
			arraysum = arraysum + arr[i];
			
		}
		
		int totalElement = arr.length - 1;
		
		int duplicatenumber = arraysum - (totalElement * (totalElement + 1))/2;
		System.out.println("Duplicate element is " + duplicatenumber);
		
		//2nd Method of doing the same thing. this method is good if multiple duplicate element is present
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<arr.length ; i++){
		
			boolean added = set.add(arr[i]);
			
			if (!added)
				System.out.println("Duplicate element is " + arr[i]);
			
		}
		
		
	}	
}
