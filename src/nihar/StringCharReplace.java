package nihar;

import java.util.Scanner;


/*
 * You have got 2 strings(S1, S2) and 1 character(c1). All inputs to be taken from user. 
 * You need to check for the character c1 in String S1, and wherever you find the character, you need to replace it with the string S2. 
Next Write all possible test cases to test the program. 
It can be possible that the character c1 is appearing more than once in the String s1. 
Clause - You are not allowed to use any Java Library methods in it. Not even charAt() method.
 */
class StringCharReplace{  

	public static void main(String args[])throws Exception{  
  
		Scanner scanner=new Scanner(System.in);

        char c=scanner.next().charAt(0);
        String str1= scanner.next();
        String str2= scanner.next();
        String newstr=new String();
        
        for(int i=0; i<str1.length() ; i++){

         if(str1.charAt(i)==c){
           newstr += str2;
         }

         else{
             newstr += str1.charAt(i);
         }
     }

     System.out.println(newstr);
   
 
 }  
}   
