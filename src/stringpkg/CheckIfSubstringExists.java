package stringpkg;

/*
 * How to check if a substring exists without using contains function
 */

public class CheckIfSubstringExists {

	public static void main(String[] args) {
		
		String str = "NiharHithere";
		String substr = "there";
		int k = 0;
		boolean found = false;
		
		for (int i=0; i<str.length();i++){
			
			k = i;
			
			for (int j=0; j<substr.length();j++){

				if (str.charAt(k)==substr.charAt(j)){
					found = true;
					k++;
				}else{
					found = false;
					break;
				}
			}
			
			if (found == true){
				System.out.println("Substring found and index is " + i);
				break;
			}					
		}			
	}
}
