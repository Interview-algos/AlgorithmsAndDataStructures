package arraypkg;

public class FindMaxMinFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,30,5,20,40,25};
		
		int min = arr[0];
		int max = arr[0];
		int maxindex = 0;
		int minindex = 0;
		
		for (int i=0; i<arr.length ; i++){
			
			if (arr[i] < min){
				min = arr[i];
				minindex = i;
			}
			if (arr[i] > max){
				max = arr[i];
				maxindex = i;
			}
		}
		
		System.out.println("Smallest " + min + "index: " + minindex);
		System.out.println("Largest "  + max + " index: " + maxindex);

	}

}
