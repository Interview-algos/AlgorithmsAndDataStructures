package nihar;

public class SortStringWithoutSortFunction {
	
	public static void main(String[] args) {
		 
		String original = "edcba";
		int j=0;
		char temp = 0;
		 
		  char[] chars = original.toCharArray();
		 
		  for (int i = 0; i <chars.length; i++) {
		      for ( j = 0; j < chars.length; j++) {
		       if(chars[j] > chars[i]){
		           temp=chars[j];
		           chars[j]=chars[i];
		           chars[i]=temp;
		       }
		   }  		 
		}
		 
		for(int k=0;k<chars.length;k++){
			System.out.println(chars[k]);
		}
		 
	}

}
