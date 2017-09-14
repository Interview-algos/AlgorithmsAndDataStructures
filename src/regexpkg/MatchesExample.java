package regexpkg;
//A Simple Java program to demonstrate working of
//Pattern.matches() in Java
import java.util.regex.Pattern;

class MatchesExample
{
 public static void main(String args[])
 {
     // Following line prints "true" because the whole
     // text "geeksforgeeks" matches pattern "geeksforge*ks"
     System.out.println (Pattern.matches("geeksforge*ks",
                                         "geeksforgeeks"));

     // Following line prints "false" because the whole
     // text "geeksfor" doesn't match pattern "g*geeks*"
     System.out.println (Pattern.matches("g*geeks*",
                                         "geeksfor"));
 }
}