package stringpkg;

public class FactorialOfANumber {
	
	public static int factorial(int num){
		
		if (num == 1)
			return 1;
		else
			return num * factorial(num-1);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));
		
	}

}
