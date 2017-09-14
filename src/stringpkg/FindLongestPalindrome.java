package stringpkg;

public class FindLongestPalindrome {
	
	public static void main(String[] args) {
		//String str = "forgeeksskeegfor" ;
		
		String str = "ABCBAHELLOHOWRACECARAREYOUIAMAIDOINGGOOD";
		
		System.out.println("Length is: " + longestPal(str));
	}
	
	
	public static int longestPal(String str){
		
		int maxlen = 1 ;
		int start = 0;
		int low,high ;
		int len = str.length() ;
		for(int i=1; i<len ; i++){
			
			
			//Even palindrome
			low = i-1;
			high = i ;
			while(low>=0 && high < len && str.charAt(low)==str.charAt(high)){
				
				if(high-low+1 >maxlen){
					start = low;
					maxlen = high-low+1;
					
				}
				low-- ;
				high++;
				
			}
			
			
			
			//Odd palindrome
			low=i-1;
			high=i+1;
			while(low>=0 && high < len && str.charAt(low)==str.charAt(high)){
				if(high-low+1 >maxlen){
					start = low;
					maxlen = high-low+1;
					
				}
				low-- ;
				high++;
			}
			
			
		}
		
		System.out.print("Longest palindrome substring is: ");
		printSubStr(str, start, start + maxlen - 1);
		return maxlen ;
		
		
	}
	
	
	
	// A utility function to print a substring str[low..high]
	static void printSubStr(String str, int low, int high) {
		System.out.println(str.substring(low, high + 1));
	}

}
