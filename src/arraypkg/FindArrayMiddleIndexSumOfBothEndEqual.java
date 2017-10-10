package arraypkg;

/*
 * Find the middle index of the array where the sum of both ends are equal
 * { 2, 4, 4, 5, 4, 1 } the middle index would be 2
 */
public class FindArrayMiddleIndexSumOfBothEndEqual {
	
	public static int findMiddleIndex(int[] arr){
		
		int startIndex = 0;
		int endIndex = arr.length -1;
		int sumLeft = 0;
		int sumRight = 0;
		
		while(true){
		
			if (sumLeft > sumRight)
				sumRight = sumRight + arr[endIndex--];
			else
				sumLeft = sumLeft + arr[startIndex++];
			
			if (startIndex > endIndex){
				if (sumLeft == sumRight)
					break;
				else
					System.out.println("Wrong array input");
			}

		}
		System.out.println(sumLeft + " " + sumRight);
		return endIndex;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = { 2, 2, 3, 1, 2, 5, 4, 1 };
		System.out.println(findMiddleIndex(num));
		
	}

}
