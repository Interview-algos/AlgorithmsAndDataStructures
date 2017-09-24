package stringpkg;

public class StringReverseRecursively {
	
	public static void main(String[] args) {
		
		String str = "Raju";
		String rev = "" ;
		int len = str.length() ;
		
		reverse(str,rev);
		
		
		
		
	}
	
	public static void reverse(String str,String rev){
		
		
		if(str.length()==0){
			System.out.println(str);
		}
		
			
		else{	
				System.out.print(str.charAt(str.length()-1));
				reverse(str.substring(0, str.length()-1),rev);
				
		}
			
	}
	}

