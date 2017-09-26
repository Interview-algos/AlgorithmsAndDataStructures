package nihar;

import java.util.HashMap;

public class FindCommonElementsBetweenArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,4,5,7,9,10,12};
		int[] arr2 = {2,6,13,7,15,20,12};
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i< arr1.length ; i++){
			if (!hm.containsKey(arr1[i]))
				hm.put(arr1[i], 1);
			else
				hm.put(arr1[i], hm.get(arr1[i]) + 1);
		}
		
		for (int i = 0; i< arr2.length ; i++){
			if (hm.containsKey(arr2[i]))
				System.out.println("Common element " + arr2[i]);
		}
		
		
		//2nd Method of doing the same thing - not very efficient
		
		for (int i = 0; i< arr1.length ; i++){
			
			for (int j = 0; j< arr2.length ; j++){
				
				if (arr1[i] == arr2[j]){
					System.out.println("Common element " + arr1[i] + " " + arr2[j]);
				}
			}
			
		}
		
		
	}

}
