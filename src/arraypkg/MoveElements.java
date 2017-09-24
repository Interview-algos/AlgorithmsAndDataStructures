package arraypkg;


/*
 * given an array I/p:{1,2,3,4,5,6,7,8} o/p:{1,3,5,7,2,4,6,8} without using temporary array
 */


public class MoveElements {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int len = arr.length ;
		int j =1 ;
		int k=2 ;
		
		if(len%2==0){
			for(int i=0; i<(len/2) ;i++){
				arr[i] = j;
				j=j+2 ;
			}
			
			for(int i=(len/2); i<len ;i++){
				arr[i] = k;
				k=k+2 ;
			}
			
		}
		
		
	
		
		else{
			for(int i=0; i<=(len/2) ;i++){
				arr[i] = j;
				j=j+2 ;
			}
			
			for(int i=(len/2)+1; i<len ;i++){
				arr[i] = k;
				k=k+2 ;
			}
		}
			
		for(int i=0; i<len ;i++){
			System.out.print(arr[i]);
		}
	}

}
