package nihar;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * There is an array with every element repeated twice except one. Find that element?
 * Here you need to find the unique number which is not repeated twice. 
 * For example if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} 
 * then your program should return 3
 */
public class FindFirstNonRepeatedElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5,6,7,7,8};
	
		//LinkedHashMap maintains insertion order
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
		for (int i:arr){
			if (hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i,1);
		}
		for (Entry<Integer, Integer> m: hm.entrySet()){
			if (m.getValue()==1){
				System.out.println(m.getKey());
				break;
			}
		}
	}

}
