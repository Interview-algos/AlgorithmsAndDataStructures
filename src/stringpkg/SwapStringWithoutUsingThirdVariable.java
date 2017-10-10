package stringpkg;

public class SwapStringWithoutUsingThirdVariable {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		s1 = s1 + s2 ; //"HelloWorld"
		s2 = s1.substring(0, s1.length()-s2.length());	//s1.substring(0, (10-5))
		s1 = s1.substring(s2.length());
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
		
	}

}
