package stringpkg;
public class FibonacciExample2 {
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String args[]) {
		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		fibonacciRecursion(count - 2);// n-2 because 2 numbers are already printed
	}

	public static void fibonacciRecursion(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibonacciRecursion(count - 1);
		}
	}
	
	

	 
	    public static void fibonacci(String a[]){
	         
	         int febCount = 15;
	         int[] feb = new int[febCount];
	         feb[0] = 0;
	         feb[1] = 1;
	         for(int i=2; i < febCount; i++){
	             feb[i] = feb[i-1] + feb[i-2];
	         }
	 
	         for(int i=0; i< febCount; i++){
	                 System.out.print(feb[i] + " ");
	         }
	    }
	}

