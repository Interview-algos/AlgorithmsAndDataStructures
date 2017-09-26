package nihar;

public class PalindromeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=76567;
		int reversed_number=0;
		int original_number = number;
		int last_digit = 0;
		
		while (number >0){
			
			last_digit = number % 10;
			reversed_number = reversed_number * 10 + last_digit;
			number = number/10;
			
		}
		
		System.out.println("Reversed number is " + reversed_number);
		if (reversed_number == original_number)
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");

	}

}
