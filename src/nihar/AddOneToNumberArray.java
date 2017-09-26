package nihar;


/*
 * a number is given as an array, 4567 is given as [4, 5, 6, 7] add 1 to this number and return [4,5,6,8].
 * [4,7,9,9] should return [4,8,0,0]
 */

public class AddOneToNumberArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,9,9};
		
		for (int i=arr.length-1; i>=0 ; i--){
			
			if (arr[i]<9){
				
				arr[i] = arr[i] + 1;
				break;
			}else
				arr[i] = 0;
		}
		
		for (int j:arr)
			System.out.print(j);

	}

}
