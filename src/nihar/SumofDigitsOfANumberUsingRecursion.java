package nihar;

public class SumofDigitsOfANumberUsingRecursion {
	
	public static int sumUsingRecursion(int num){
		
		if (num < 10)
			return num;
		else
			return ( num%10 + sumUsingRecursion(num/10) );
	}
	
	public static int sumWithoutRecursion(int num){
		int sum = 0;
		while (num!=0){
			sum = sum + num%10;
			num = num/10;
		}
		return sum;
	}

	public static void main(String args[]){
		System.out.println(sumUsingRecursion(1254));
	}
}
