package nihar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Union and Intersection between 2 array.
 * Input {2,4,5,7,9,10,12} and {2,6,13,7,15,20,12}
 * Intersection elements: 2,7,12
 * Union elements: Remaining elements
 */

public class FindUnionIntersectionBetweenArray {

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
			if (!hm.containsKey(arr2[i]))
				hm.put(arr2[i], 1);
			else
				hm.put(arr2[i], hm.get(arr2[i]) + 1);
		}
		
		ArrayList<Integer> intersection = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();
		
		for (Map.Entry<Integer,Integer> m: hm.entrySet()){
			if (m.getValue() > 1){
				intersection.add(m.getKey());
			}else{
				union.add(m.getKey());
			}		
		}
		
		System.out.println("Intersection elements " + intersection.toString());
		System.out.println("Union elements " + union.toString());


	}

}
