package nihar;

public class PowerOfANumberUsingRecursion {

	public static int pow( int a, int n) {
	    if ( n == 0 ) {
	        return 1;
	    }
	    return ( a * pow(a,n-1));
	}
	
	public static void main(String[] args) {
		
		System.out.println(pow(-2,3));
		System.out.println(pow(4,3));
	}

}
