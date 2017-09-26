package nihar;

import java.util.HashMap;
import java.util.Map;

/*
 * Find the number in an array which is repeated odd number of times
 * Input {1,1,1,1,2,2,2,3,3,4,4}, Output will be 2 since 2 is repeated 3 times.
 * 
 */

public class FindOddRepeatedNumberArray {
	
	public static void main(String args[]){
	
	int[] array1 = {1,1,1,1,2,2,2,3,3,4,4};
	
	Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	for (int i=0; i<array1.length ; i++){
		
		if (!hm.containsKey(array1[i])){
			hm.put(array1[i], 1);
		}else{
			hm.put(array1[i], hm.get(array1[i])+1);
		}
	}
	
	for (Map.Entry<Integer,Integer> m: hm.entrySet() ){
		
		if ( m.getValue() % 2 == 1){
			System.out.println("the odd repeated number " + m.getKey());
		}
	}
	
	}

}
