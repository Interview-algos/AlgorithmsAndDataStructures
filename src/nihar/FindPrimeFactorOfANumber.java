package nihar;

import java.util.HashSet;

/*
 * In the prime factorization of 36 = 2*2 x 3*3, the two is used as a factor two times 
 * and the three is used as a factor twice. When checking to see if a number is prime or not,
 * you need only divide by those prime numbers that when squared remain less than the given number
 */
public class FindPrimeFactorOfANumber {

	public static void main(String[] args) {		
		int num = 36;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=2; i<=num; i++){
			if(num % i == 0){
				hs.add(i);
				num = num/i;
				i--;
			}
		}		
		for (int i:hs)
			System.out.println(i);
	}
}

