package arraypkg;

public class FindMissingNumberInSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,6,7,8,9,10};
		
		int sum = 0;
		
		for (int i=0; i<arr.length ; i++){
			sum = sum + arr[i];
		}
		int last_num = arr[arr.length-1];
		int missingNum = (last_num * (last_num+1))/2 - sum;
		
		System.out.println(missingNum);
	}

}
