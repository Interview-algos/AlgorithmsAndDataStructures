package nihar;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		String str = "Hello World   Nihar";
		String arr[] = str.split(" ");
		String reverse_str = "";
		
		for (int i=arr.length-1 ; i>=0 ; i--){

			if (i == arr.length-1){
				reverse_str = reverse_str + arr[i];
			}else{
				reverse_str = reverse_str + " " + arr[i];
			}
		}
		System.out.println(reverse_str);
	}
}
