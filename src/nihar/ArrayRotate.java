package nihar;

/*
 * Input is 1,2,3,4,5,6,7,8
If rotateOrder = 2
Output should be 7,8,1,2,3,4,5,6
If rotateOrder = 3
Output should be 6,7,8,1,2,3,4,5
 */
public class ArrayRotate {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		int rotateOrder = 3;
		
		for (int i=0; i<rotateOrder ; i++){
			
			for (int j=arr.length-1; j>0; j--){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
		
		for (int a:arr){
			System.out.print(a + " ");
		}
	}
}
