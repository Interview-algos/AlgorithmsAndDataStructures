/*
 *
 StringTokenizer(String str) :
str is string to be tokenized.
Considers default delimiters like new line, space, tab, 
carriage return and form feed.

StringTokenizer(String str, String delim) :
delim is set of delimiters that are used to tokenize
the given string.

StringTokenizer(String str, String delim, boolean flag):
The first two parameters have same meaning.  The flag 
serves following purpose.

If the flag is false, delimiter characters serve to 
separate tokens. For example, if string is "hello geeks"
and delimiter is " ", then tokens are "hello" and "geeks".

If the flag is true, delimiter characters are 
considered to be tokens. For example, if string is "hello
 geeks" and delimiter is " ", then tokens are "hello", " " 
and "geeks".
 */




package stringpkg;

import java.util.StringTokenizer;

public class StringTokenizerDemo {



	/* A Java program to illustrate working of StringTokenizer
	   class:*/

	public static void main(String args[])
	{
		System.out.println("Using Constructor 1 - ");
		StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");
		while (st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		System.out.println("----------------------------");

		System.out.println("Using Constructor 2 - ");
		StringTokenizer st2 = 
				new StringTokenizer("JAVA : Code : String", " :");
		while (st2.hasMoreTokens())
			System.out.println(st2.nextToken());
		
		System.out.println("----------------------------");

		System.out.println("Using Constructor 3 - ");
		StringTokenizer st3 = 
				new StringTokenizer("JAVA : Code : String", " :",  true);
		while (st3.hasMoreTokens())
			System.out.println(st3.nextToken());
		
		
		System.out.println("----------------------------");
		
		
		System.out.println("Using Constructor 1 - ");
		StringTokenizer st4 = 
				new StringTokenizer("JAVA, : Code\t : String\n", " ",  false);
		while (st4.hasMoreTokens())
			System.out.println(st4.nextToken());
	}
}


