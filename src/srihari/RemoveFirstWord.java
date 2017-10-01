package srihari;

public class RemoveFirstWord {

	public static void main(String[] args) {
		String s1 = "A statement is statement of A";
		String s2 = "is a statement";
		
		String[] word2 = s2.split(" ");
		
		String ret = "";
		for(String word: word2) {
			if (s1.indexOf(word)!=-1) {
				int index = s1.indexOf(word);
				ret = s1.substring(0,index) + s1.substring(index+word.length(), s1.length());
			}
		}
		
		System.out.println(ret);
	}
}
