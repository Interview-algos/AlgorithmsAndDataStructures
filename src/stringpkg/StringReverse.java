package stringpkg;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str = "Raju" ;
		char a[]  = str.toCharArray() ;
		int len = a.length ;
		String rev = "" ;
		for(int i=(len-1);i>=0 ;i--){
			rev = rev + a[i];
		}
		
		System.out.println("reverse String : " + rev);
	}

}
