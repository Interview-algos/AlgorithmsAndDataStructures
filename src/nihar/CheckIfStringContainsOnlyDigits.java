package nihar;

public class CheckIfStringContainsOnlyDigits {

	public static boolean checkIfContainsOnlyDigits(String str1){
		
		char[] arr = str1.toCharArray();
		boolean result = false;
		try{
			for (char c:arr){
				Integer.parseInt(String.valueOf(c));
			}
			result = true;
		}catch(NumberFormatException e){
			result = false;
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex = "[0-9]+";
		String str = "3839823983";
		
		System.out.println(str.matches(regex));
		
		String str1 = "9232s9920";
		System.out.println(checkIfContainsOnlyDigits(str1));

	}

}
