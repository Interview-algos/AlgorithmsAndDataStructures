package others;
import java.io.*;

// Java code to demonstrate star pattern
public class PrintStars
{
	// Function to demonstrate printing pattern
	public static void printStars(int n)
	{
		// number of spaces
		int i, j, k=2*n-2;
	//	int i, j, k=n-1;

		// outer loop to handle number of rows
		// n in this case
		for(i=0; i<n; i++)
		{

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for(j=0; j<k; j++)
			{
				// printing spaces
				System.out.print(" ");
			}
			
			// decrementing k after each loop
			k = k - 2;
			
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for(j=0; j<=i; j++)
			{
				// printing stars
				System.out.print("* ");
			}
			
			// ending line after each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[])
	{
		int n = 20;
		printStars(n);
	}
}
