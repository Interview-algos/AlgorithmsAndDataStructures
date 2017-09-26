package nihar;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindAllOneinArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,0,1,1,0,0,1,1,0,0,0,1,1,1};
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i=0; i<arr.length ; i++){
			
			if(hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i],1);
		}
		
		for(Entry<Integer, Integer> m: hm.entrySet()){
			if (m.getKey() == 1)
				System.out.println("Number of 1 is " + m.getValue());
		}
		
		int[] arr1 = {0,1,0,1,1,0,0,1,1,0,0,0,1,1,1};
		
		
		//2nd Method
		
		int sum = 0;
		
		for (int i=0; i< arr1.length;i++){
			sum = sum + arr1[i];
		}
		
		System.out.println("Number of 1 is " + sum);
		System.out.println("Number of 0 is " + (arr1.length - sum));
		
		
	}

}
