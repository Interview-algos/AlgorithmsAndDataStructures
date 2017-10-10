package stringpkg;

public class FindAllPairsIntegerWhoseSumIsEqualToNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		int[] arr = {1,2,3,4,5,6,3,9};	
		
		
		for (int i=0; i<arr.length ; i++){
			for (int j=i+1; j<arr.length-1; j++){

				if ((arr[i]+arr[j]) == num)
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
		
	}

}
