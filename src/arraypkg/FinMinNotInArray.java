package arraypkg;


/*Given an unsorted array of integers find a minimum number which is not present in array. 
e.g -1 ,4, 5, -23,24 is array then answer should be -24.

*/
public class FinMinNotInArray {
	
	
	public static void main(String[] args) {
		int[] num = {-1,4,5,-23,24};
		int min = 0 ;
		
		for(int i=0; i<num.length;i++){
			
			if(num[i] < min){
				min = num[i];
				
			}
			
			
		}
		System.out.println("min from array" + min);
		System.out.println("min not in array is " + (min-1));
	}

}
