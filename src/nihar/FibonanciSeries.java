package nihar;

public class FibonanciSeries {

	// Java program for Fibonacci number using recursion.
	
	public static int fibonanciRecursion(int num){
		if (num == 1 || num == 2)
			return 1;
		else
			return fibonanciRecursion(num-1) + fibonanciRecursion(num-2);		
	}
	
	// Java program for Fibonacci number using Loop.
	
    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci; //Fibonacci number
    } 
	
	public static void main(String[] args) {
		
		int fibCount = 15;
		int[] fib = new int[15];
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i=2; i<fibCount ; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for (int j:fib)
			System.out.print(j+" ");

		System.out.println();
		
		for (int i=1; i<=fibCount; i++){
			System.out.print(fibonanciRecursion(i) + " ");
		}
		
		System.out.println();
		
		for (int i=1; i<=fibCount ; i++){
			System.out.print(fibonacciLoop(i) + " ");
		}
	}

}
