package nihar;

/*
 * Given input 15 it should print
 * 
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
 */

public class PrintNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 15;
		for (int i=1;i<=n;i++){
			
			if (i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if (i%5 == 0)
				System.out.println("Buzz");
			else if (i%3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
			
		}
		
	}

}
