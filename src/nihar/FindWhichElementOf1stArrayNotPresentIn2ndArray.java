package nihar;

import java.util.ArrayList;

public class FindWhichElementOf1stArrayNotPresentIn2ndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,3,4,7,10,12,15};
		int[] arr2 = {1,3,7,12,15};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int a:arr2){
			al.add(a);
		}
		
		for(int i=0 ; i<arr1.length; i++){
			if (!al.contains(arr1[i]))
				System.out.println("Number is " + arr1[i]);
		}
		

	}

}
