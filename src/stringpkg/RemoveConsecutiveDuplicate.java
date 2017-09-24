package stringpkg;

public class RemoveConsecutiveDuplicate {
	
	public static void main(String[] args){
		//String str = "AAABBCCDDDEFGH"; 
		//String str = "AABBCDDE"; 
		//String str ="ABCDE";
		String str ="AAABBBBCCCCCDDDDDDEEEEEEE";
		removeDuplicate(str);
	}
	
	public static void removeDuplicate(String str){
		
		char[] a = str.toCharArray();
		int slow = 0;
		StringBuilder strBldr = new StringBuilder();
		for(int i=0; i<a.length ;i++){
			if(a[slow] != a[i]){
				strBldr.append(a[slow]);
				slow = i ;
			}
			
			
		}
		
		strBldr.append(a[a.length-1]);
		
		System.out.println(strBldr);
	}

}
