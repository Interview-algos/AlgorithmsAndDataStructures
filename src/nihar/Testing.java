package nihar;

import java.util.Scanner;

/*
 * You need to write this program again, without using any library methods. 
 * Take the following inputs from user and print the following output. 

1	1 
1	11 
0	011 
1	0111 
0	00111 
0	000111 
0	0000111 

i.e if user types 1 then 1 will be at printed right shift, and 0 will be printed left shift. 
Note: There is no definite count of number of Inputs user wants to give, or sequence of inputs 
user wants to give. User can give any number of inputs, and it should display the result as above.
 */

public class Testing {

	static String s ="";
	
	public static String testmethod(String args) 
	{ 

	if(args.equals("0")) 
	{ 
	s = args+s; 

	} 
	else if(args.equals("1")) 
	{ 
	s = s+args; 
	} 

	return s; 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		while (in.hasNext()) 
		{ 
			String str = in.nextLine(); 
			if(str.equals("1") || str.equals("0")) 
			{ 
				String s1 = testmethod(str); 
				System.out.println(s1); 
			} 
			else 
				return; // break; can also be used here. 
		} 
	}

}
