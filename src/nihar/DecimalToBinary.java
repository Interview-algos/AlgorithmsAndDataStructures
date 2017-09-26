package nihar;

public class DecimalToBinary {
	
	public static void ConvertDecimalToBinary(int number){
		
		int[] arr = new int[30];
		int index = 0;
		
		while(number > 0){
			arr[index++] = number % 2;
			number = number/2;
		}
		
		for (int i=index-1; i>=0; i--){
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
	
	public static void convertDecimalToBinaryUsingRecursion(int num) {
	    if (num>0) {
	        convertDecimalToBinaryUsingRecursion(num/2);
	        System.out.print(num%2);
	    }
	}
	
	public static void ConvertBinaryToDecimal(long binary){
		
		long decimal = 0;
		long power = 0;
		long tmp = 0;
		
		while (binary > 0){
			tmp = binary%10;
			decimal = decimal + (long)(tmp * Math.pow(2, power));
			binary = binary / 10;
			power++;
		}
		System.out.println("Decimal number is " + decimal);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertDecimalToBinary(130);
		convertDecimalToBinaryUsingRecursion(130);
		System.out.println();
		ConvertBinaryToDecimal(10000010);

	}

}
