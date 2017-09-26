package nihar;


public class FourSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,8,9,2,1,10,11,4,5,12,6};
		int count = 0;
		
		for (int i=0; i< a.length-3 ; i++){
			for (int j=i+1; j<a.length-2; j++){
				for (int m=j+1; m<a.length-1; m++){
					for (int n=m+1; n< a.length ;n++){
						if (a[i] == a[j] + a[m] + a[n] ||
							a[j] == a[i] + a[m] + a[n] ||
							a[m] == a[j] + a[i] + a[n] ||
							a[n] == a[j] + a[m] + a[i] ){
							
							System.out.println(a[i] + ", " + a[j] + ", " + a[m] + ", " + a[n]);
							count++;
							
						}
					}
				}
			}			
		}		
		System.out.println("Total combination " + count);
	}
}
