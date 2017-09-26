package nihar;

public class ArraySumSubset1 {

	public static void main(String[] args) {
		int[] arr = {3,4,7,1,2,9,8};
		
		for (int i=0; i< arr.length-3; i++){
			for (int j=i+1; j<arr.length-2; j++){
				for(int m=j+1; m<arr.length-1; m++){
					for (int n=m+1; n<arr.length; n++){
						if ((arr[i] + arr[j] == arr[m] + arr[n])||
							(arr[i] + arr[m] == arr[j] + arr[n])||
							(arr[i] + arr[n] == arr[j] + arr[m])){
							System.out.println(arr[i] + " " + arr[j] + " " +arr[m] + " " + arr[n]);
							
						}
					}
				}
			}
		}

	}

}
