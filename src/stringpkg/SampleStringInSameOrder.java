/**
 * Find if the characters of the sample string is in the same order in the text string.. Give a simple algo.. 
Eg.. TextString: abcNjhgAhGjhfhAljhRkhgRbhjbevfhO 
Sample string :NAGARRO
 */


package stringpkg;

public class SampleStringInSameOrder {
	
	public static void main(String[] args) {
		
	}





public static void sameOrder(){

		String str = "abcNjhgAhGjhfhAljhRkhgRbhjbevfhO" ;
		String sampleStringg = "NAGARRO" ;
		int prevIndex = 0 ;
		int curIndex = 0;
		
		char[] a = str.toCharArray();
		for(int i=0;i<sampleStringg.length();i++){
			
		
			for(int j=0;j<str.length();j++){
				
				if(sampleStringg.charAt(i) == a[j]){
					prevIndex = curIndex ;
					curIndex = a[j] ;
					break;
				}
				
				if(prevIndex > curIndex){
					System.out.println("Not in Order");
				}
				
			}
		}
		
	}

}