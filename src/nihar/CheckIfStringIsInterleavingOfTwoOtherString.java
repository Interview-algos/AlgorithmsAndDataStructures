package nihar;

public class CheckIfStringIsInterleavingOfTwoOtherString {

	public static void main(String args[]){
		  String str1 = "ABC";
		  String str2 = "XYZ";
		  String str3 = "XAYZBC";
		   
		  System.out.println(isInterleaved(str1, str2, str3));
	}
		 
	private static boolean isInterleaved(String str1, String str2, String strToCheck) {
		   
		  int i=0, j=0, k=0;
		   
		  if(str1.length() + str2.length() != strToCheck.length()){
		   return false;
		  }
		   
		  for (k=0; k<strToCheck.length() ; k++){
		    
			   if( i < str1.length() && str1.charAt(i) == strToCheck.charAt(k))
				   i++;
			   else if(j < str2.length() && str2.charAt(j) == strToCheck.charAt(k))
				   j++;
			   else
				   return false;
		  }
		   
		  if( i != str1.length() || j != str2.length() || k != strToCheck.length()){
			  return false;
		  }
		  return true;
	}
		  
		}