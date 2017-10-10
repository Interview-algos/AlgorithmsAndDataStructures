package stringpkg;

public class ReverseANumberUsingRecursion {

	public static void revers(int num) 
    { 
        if(num == 0) 
        	return; 
        else { 
           System.out.print(num%10); 
        } 
        revers(num/10); 
    } 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 2923838;
		revers(num);

	}

}
