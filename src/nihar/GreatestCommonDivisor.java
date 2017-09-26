package nihar;

public class GreatestCommonDivisor {
	
	public static int gcd(int n1, int n2){
		
		int r;
        
        while(n2 != 0)
        {
            r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        
        return n1;
		
	}
	
	public static void main(String args[])throws Exception
    {
        System.out.println(gcd(24,18));
    }

}
