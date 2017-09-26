package nihar;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str = "Hi My name   is Nihar";
		String[] arr = str.split(" ");
		String reverseString = "";			
		
		for(int i=0; i<arr.length; i++){
						
			/*
			String reverse_word = "";
			String word = arr[i]; 
			for (int j=word.length()-1; j>=0; j--){
				reverse_word = reverse_word + word.charAt(j);
			}
			*/
			StringBuilder sb = new StringBuilder(arr[i]); //2nd method			
			arr[i] =  sb.reverse().toString();
			
			if(i==0)
				reverseString = reverseString + arr[i];	
			else
				reverseString = reverseString + " " + arr[i];
		}
		
		System.out.println(reverseString);
	}
}
