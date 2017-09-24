package sreehari;

import java.util.HashSet;
import java.util.Set;

public class FindOneDuplicate {

	public static void main(String[] args) {
		boolean b = findDup(new int[]{20, 34, 21, 87, 87, 100});
		
		System.out.println(b);
	}

	 public static boolean findDup(int[] numbers) {
		 
		 Set<Integer> set = new HashSet<Integer>();
		 
		 for (int i = 0; i < numbers.length; i++) {
			if (!set.add(numbers[i])) {
				return true;
			}
		}
		 return false;
	 }
}

