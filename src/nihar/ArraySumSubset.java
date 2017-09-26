package nihar;

/* write a program takes array input{1,0,2,3} and num =3 
 * and provides output {1,2}{0,3}{2,1}{3,0} sum equals the num.
 * 
 */

public class ArraySumSubset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,2,3};
		int num = 3;
		
		for (int i=0;i<arr.length;i++){
			
			for (int j=i+1;j< arr.length ; j++){
				
				if ((arr[i] + arr[j]) == num){
					
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
			
		}
		

	}

}
