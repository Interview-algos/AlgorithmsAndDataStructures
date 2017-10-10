package stringpkg;

public class NumberOfVowelsAndConsonantsInString {
	
	public static void main(String args[])
	{
		String str;
		int vowels = 0, consonants = 0;
		char ch;

		str = "saasakdjasaueasncmndakdkla";

		for(int i = 0; i < str.length(); i ++)
		{
			ch = str.charAt(i);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else
				consonants ++;
		}

		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}

}
