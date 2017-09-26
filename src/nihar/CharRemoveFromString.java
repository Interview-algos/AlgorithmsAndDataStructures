package nihar;

public class CharRemoveFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Nihmarm";
		char remove = 'm';
		char[] arr1 = name.toCharArray();
		
		StringBuilder sb = new StringBuilder();

		for (char ch: arr1){
			if (ch != remove)
				sb.append(ch);
		}
		
		System.out.println(sb.toString());
	}

}
