package chapter1;


public class GCDFinder {
	
	
	
	/**
	 * This method takes two positive integers and finds their gcd using 
	 * Euclid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	public int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}	
	
	
	
	
public static int gcd2(int n1, int n2){
		
		int r;
        
        while(n2 != 0)
        {
            r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        
        return n1;
		
	}
	
	public static void main(String[] args) {
		System.out.println(new GCDFinder().gcd(25, 10)); // should print 5
		 System.out.println(gcd2(24,18));
	}
}
