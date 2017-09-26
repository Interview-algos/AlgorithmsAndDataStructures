package nihar;

public class TestCyclicString {
	
	public static boolean isClyclic(String original, String test){
		
		int rotateOrder = original.length() - original.indexOf(test.charAt(0));
		char[] arr = original.toCharArray();
		
		for (int i=1; i<=rotateOrder ; i++){
			
			for (int j=arr.length-1 ;j>0 ; j--){
				char temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}			
		}
		
		String final_str = "";
		for (char ch: arr)
			final_str = final_str + ch;
		System.out.println("Cyclic word: " + final_str);
		
		return final_str.equalsIgnoreCase(test);
		
	}
	
	
	public static boolean isCyclicSecondWay(String s1, String s2){
		 
        boolean isCyclic = false;
 
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
            isCyclic = false;
        }
        else
        {
 
            String s3 = s1 + s1;
 
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
                isCyclic = true;
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
                isCyclic = false;
            }
        }
        
        return isCyclic;
	}
	
	public static void main(String args[]){
		
		System.out.println(isClyclic("ABCDEF","DEFABC"));
		System.out.println(isClyclic("ABCDEF","EFABCD"));
		System.out.println(isClyclic("ABCDEF","DCEFAB"));
		System.out.println(isClyclic("ABCDEF","EFDABC"));
		
		System.out.println(isCyclicSecondWay("ABCDEF","DEFABC"));
		System.out.println(isCyclicSecondWay("ABCDEF","EFABCD"));
		System.out.println(isCyclicSecondWay("ABCDEF","DCEFAB"));
		System.out.println(isCyclicSecondWay("ABCDEF","EFDABC"));
		
	}

}
