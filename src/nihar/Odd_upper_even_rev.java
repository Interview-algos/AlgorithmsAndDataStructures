package nihar;


/*
 * Write a program to modify the string in following pattern, 
Change odd words to uppercase and Reverse the even words. Make sure that the spaces (multiple) 
between the words remains as it is. 
E.g.: 
Input : "This is a test String!!" 
Output: "THIS si A tset STRING!!"
 */
public class Odd_upper_even_rev {
	public static void main(String args[]){
		String str="This is a   test   string!!";
		String finalstr="",arr[]=str.split(" ");
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
				arr[i]=arr[i].toUpperCase();
			else
			{
				StringBuffer sb=new StringBuffer(arr[i]);
				arr[i]=sb.reverse().toString();				
			}
		}
		for(int j=0;j<len;j++)
		{
			if (j==0){
				finalstr=finalstr + arr[j];
			}else{
				finalstr=finalstr+" "+arr[j];
			}
		}
		System.out.println(finalstr);       		
	}
}