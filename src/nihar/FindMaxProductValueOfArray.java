package nihar;

/*
 * Find the max product value of 3 number from the given array . 
For example , if array has [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16] find the max product from three numbers. max_product(x*x*x) 
Twist is array can contain negative number as well
 */
public class FindMaxProductValueOfArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,-15,16};
		
		int max = Integer.MIN_VALUE;
	    int smax =Integer.MIN_VALUE;
	    int tmax = Integer.MIN_VALUE;

	        for (int i = 0; i < a.length ; i++) {

	            if (a[i]>max){
	                tmax =smax;
	                smax=max;
	                max =a[i];
	            }else if (a[i]>smax){
	                tmax =smax;
	                smax=a[i];
	            }else if(a[i]>tmax){
	                tmax = a[i];
	            }

	        }
	        System.out.println(String.format("max value %s second max value %s and third max value %s", max,smax,tmax));

	}

}
