package nihar;

public class SortAStringOnLength {

	public static void main(String[] args) {
		
		String str = "I am Good Boy";
		String[] arr = str.split("\\s");
		
		for (String st: arr)
			System.out.println(st);
		
		System.out.println("==================");
		
		for (int iteration=1; iteration <= arr.length ; iteration++ ){
			for (int j=0; j< arr.length - iteration; j++){
				if (arr[j].length() > arr[j+1].length()){
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (String st: arr)
			System.out.println(st);
	}
}
