	package nihar;

public class ReverseNumber {

	public static void reverseNum(int num){
		
		if (num == 0)
			return;
		else
			System.out.print(num%10);
		reverseNum(num/10);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 382992;
		int reverse = 0;
		int last_digit = 0;
		
		while (num > 0){
			last_digit = num % 10;
			reverse = reverse * 10 + last_digit;
			num = num/10;
		}
		
		System.out.println(reverse);
		num = 382992;
		reverseNum(num);

	}

}
