package stringpkg;

public class BinaryToDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int binary = 1110100100;
		int decimal = 0;
		int power = 0;
		while (binary > 0){
			
			int lastdigit = binary % 10;
			decimal = decimal +(int) (lastdigit * Math.pow(2, power));
			binary = binary/10;
			power++;
		}

		System.out.println(decimal);
	}

}
