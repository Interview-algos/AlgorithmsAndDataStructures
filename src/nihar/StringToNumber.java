package nihar;

public class StringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "362878";
		char[] arr1 = num.toCharArray();
		int zeroascii = (int)'0';
		int sum = 0;
		for (char c: arr1){
			int tmpAscii = (int)c - zeroascii;
			sum = sum*10 + tmpAscii;
		}

		System.out.println(sum);
	}
}
