package nihar;

public class ReverseStringUsingRecursion {

	public static String reverseRecursion(String str){
		String reverse = "";
		if (str.length() == 1)
			reverse = str;
		else
			reverse = reverse + str.charAt(str.length()-1) + reverseRecursion(str.substring(0,str.length()-1));			
		return reverse;
	}
	public static void main(String[] args) {
		
		System.out.println(reverseRecursion("HelloJava"));

	}

}
