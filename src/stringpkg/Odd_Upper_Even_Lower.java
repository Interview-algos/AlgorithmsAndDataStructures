package stringpkg;

/*
 * Convert the string to make it Odd words uppercase and even words lowercase
 * input - This is a   test   string!!
 * output - THIS is A   test   STRING!!
 */
public class Odd_Upper_Even_Lower {

	public static void main(String args[]){
		
		String str="This is a   test   string!!";
		String finalstr="";
		String arr[]=str.split(" ");

		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
				arr[i]=arr[i].toUpperCase();				
			else
				arr[i]= arr[i].toLowerCase();				
		}
		for(int j=0;j<arr.length;j++)
		{
			if (j==0)
				finalstr=finalstr+arr[j];
			else
				finalstr=finalstr+" "+arr[j];
		}
		System.out.println(str);  
		System.out.println(finalstr);        		
	}
}
