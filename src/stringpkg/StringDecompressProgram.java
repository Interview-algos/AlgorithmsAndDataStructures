package stringpkg;


/*
 * given a string in form of an array find an expanded string 
e.g. A2B3C4 => AABBBCCCC 
also, size of given array is exactly same as expanded string. so return the same array with expanded string.

 */
public class StringDecompressProgram {

	public static void main(String[] args) {		
		
		String str = "A2B3C4D5";
		StringBuilder sb = new StringBuilder();
		char[] expanded = new char[14];
		int index = 0;
		
		for (int i=0; i<str.length();i=i+2){
			
			char ch = str.charAt(i);
			int count = Integer.parseInt(String.valueOf(str.charAt(i+1)));
			
			for (int j=0;j<count; j++){
				sb.append(ch);
				expanded[index++] = ch;
			}
		}
		
		System.out.println(sb);
		for (char i:expanded){
			System.out.print(i);
		}		
	}
}
