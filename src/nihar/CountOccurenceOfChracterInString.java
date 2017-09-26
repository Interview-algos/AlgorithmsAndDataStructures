package nihar;

public class CountOccurenceOfChracterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java J2EE and automation";
		
		char ch = 'a';
		int count = 0;
		char[] arr = str.toCharArray();
		
		for(char c: arr){
			if(c==ch)
				count++;
		}
		
		System.out.println("Total occurence of " + ch + " is " + (count-1));

	}

}
