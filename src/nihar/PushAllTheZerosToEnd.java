package nihar;

/** Push all the Zeros to end
 * 
 * @author nmoharana
 * Input {1,4,0,3,0,5,8,0,32} 
 * O/P 	 {1 4 3 5 8 32 0 0 0 }
 *
 */

public class PushAllTheZerosToEnd {

	public static void main(String[] args) {

		int[] arr= {1,4,0,3,0,5,8,0,32};		
		int count = 0;
		
		for (int i=0; i<arr.length; i++){
			if (arr[i] != 0){
				arr[count++] = arr[i];
			}
		}
		
		while (count < arr.length){
			arr[count++] = 0;
		}
		
		for (int i:arr)
			System.out.print(i+" ");		
	}

}
