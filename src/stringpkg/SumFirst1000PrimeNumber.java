package stringpkg;

public class SumFirst1000PrimeNumber {

	public static void main(String[] args) {
		
		int num=2;
		int sum = 0;
		int count = 0;
		
		while (count<1000){
			
			if (isPrimeNumber(num)){
				sum = sum + num;
				count++;				
			}
			num++;
		}
		System.out.println(sum);
	}
	
	private static boolean isPrimeNumber(int num){
		
		for (int i=2; i<=num/2; i++){			
			if (num%i == 0)
				return false;
		}
		return true;
	}

}
