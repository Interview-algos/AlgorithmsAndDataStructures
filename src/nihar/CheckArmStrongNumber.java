package nihar;


/*
 * Armstrong numbers are the sum of their own digits to the power of the number of digits 
 * 153 = 1 + 125 + 27 = 153
 * 371 = 27 + 343 + 1 = 371
 */

public class CheckArmStrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int original_num = num;
		int sum = 0;
		
		while (num > 0){
			int lastdigit = num %10;
			sum = sum + (int) Math.pow(lastdigit, 3);
			num = num/10;
		}
		
		System.out.println("Armstrong: " + (original_num == sum));
		
	}

}
