package sreehari;


public class BubbleSort {

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
				
			}
		}
		
		printArr(arr);
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {4,7,5,11,9};
		sort(a);
		
	}
}
