package stringpkg;

public class Anagrams {
	
	public static void main(String[] args) {
		String str1 = "geeksforgeeks" ;
		String str2 = "forgeeksgeeks";
		int sum1 =0 ;
		int sum2=0;
		int asciiValue = 0 ;
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		int asciiArr1[] = new int[256];
		int asciiArr2[] = new int[256];
		
		for(int i=0 ;i<charArr1.length ; i++){
			asciiValue = (int)charArr1[i];
			asciiArr1[asciiValue] = asciiValue ;
		}
		
		for(int i=0 ;i<charArr2.length ; i++){
			asciiValue = (int)charArr2[i];
			asciiArr2[asciiValue] = asciiValue ;
		}
		
		
		
		for(int i=0 ;i<asciiArr1.length ; i++){
			 sum1 = sum1 + asciiArr1[i];
					
		}
		
		for(int i=0 ;i<asciiArr2.length ; i++){
			 sum2 = sum2 + asciiArr2[i];
					
		}
		
		if(sum1 == sum2){
			System.out.println("Both the strings are anagram");
		}
		
		else
			System.out.println("Strings are not anagram");
	
		
	}

}
