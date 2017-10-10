package arraypkg;

/*
 * Find the longest running positive sequence in an Array?
{1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6}
It should return 5 with index=8
 */
public class FindLongestRunningPositiveSequence {

	public static void main(String[] args) {
		
		int[] a = {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6};
		
		int maxLength = 0;
		int maxIndex = 0;
		int currentLength = 0;
		int currentIndex = 0;
		boolean flag = false;
		for (int i=0; i< a.length;i++){
			
			if (a[i] > 0){
				
				if (flag == false){
					flag = true;
					currentIndex = i;
					currentLength = 1;					
				}else{
					currentLength++;
				}
			}else{
				
				if (currentLength > maxLength){
					maxLength = currentLength;
					maxIndex = currentIndex;
				}
				flag = false;
			}
		}
		
		if (maxLength > 0)
			System.out.println("Index " + maxIndex + " length " + maxLength);
	}
}
