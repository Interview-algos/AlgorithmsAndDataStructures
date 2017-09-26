package nihar;


/*
 * 111001010 is a binary number. 19291102 is not a binary number
 */
public class CheckIfNumberIsBinary {

	public static boolean checkBinary(int num){
		int tmp = 0;
		boolean binary = true;
		while (num > 0){
			tmp = num%10;
			if (tmp > 1){
				binary = false;
				break;
			}
			num = num/10;
		}		
		return binary;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("1010101011: Binary " + checkBinary(1010101011));
		System.out.println("19291102: Binary " + checkBinary(19291102));
	}

}
