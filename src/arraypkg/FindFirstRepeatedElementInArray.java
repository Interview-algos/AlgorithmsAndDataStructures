package arraypkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatedElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,4,5,7,9,10,12,10,5};
		
		//LinkedHashMap maintains insertion order
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i< arr1.length ; i++){
			if (!hm.containsKey(arr1[i]))
				hm.put(arr1[i], 1);
			else
				hm.put(arr1[i], hm.get(arr1[i]) + 1);
		}
		
		for(Map.Entry<Integer,Integer> m: hm.entrySet()){
			if (m.getValue() > 1){
				System.out.println("First repeated number " + m.getKey());
				break;
			}
		}
		

	}

}
