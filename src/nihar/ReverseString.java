package nihar;

public class ReverseString {

	public static String reverseRecurse(String str){
	
		if (str.length()<2)
			return str;
		
		return reverseRecurse(str.substring(1))+str.charAt(0);
		
	}
	
	public static String reverseUsingRecursion(String str){
		String reverse = "";
		if (str.length() == 1)
			return str;
		else{
			reverse = reverse + str.charAt(str.length()-1) + reverseUsingRecursion(str.substring(0,str.length()-1));	
			return reverse;
		}

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "HelloWorld Nihar";
		StringBuilder reverseStr = new StringBuilder();
		for (int i=str.length()-1; i>=0; i--){
			reverseStr.append(str.charAt(i));
		}
		System.out.println(reverseStr);
		
		System.out.println(reverseRecurse(str));
		System.out.println(reverseUsingRecursion(str));
		
	}

}
