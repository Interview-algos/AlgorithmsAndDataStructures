package nihar;

public class FindFirstAndSecondHighestNumberArray {

	public static void main(String[] args) {
		
		int[] arr = {10,30,5,20,40,25};
		
		int highest_number = arr[0];
		int second_highest = arr[0];
		
		for (int i=0; i<arr.length ; i++){
			
			if (arr[i] > highest_number){
				highest_number = arr[i];
			}
			if (arr[i] != highest_number && arr[i] > second_highest){
				second_highest = arr[i];
			}				
		}
				
		System.out.println("Highest " + highest_number);
		System.out.println("Second highest " + second_highest);

	}

}
