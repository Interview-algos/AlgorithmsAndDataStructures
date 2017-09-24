package arraypkg;


/*
 * You are given a rotated sorted array of size N. You have to search a given number into it. 
Example: [4,6,8,14,90,-9,-2,0,3], Search -2.


http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/ 
 */
public class SearchInSortedRotatedArray {
	
	public static void main(String[] args) {
		//int[] a = {4,6,8,14,90,-9,-2,0,3} ;
		int[] a = {4,6,8,14,90,100,-2,0,3} ;
		
		int len = a.length;
		
		int h = len-1 ;
		int key = -2 ;
		int l = 0;
		search(a, l, h, key);
		
		
	}
	
	public static int search(int[] a, int l, int h,int key ){
		
		 if (l > h) 
	            return -1;
		 
		int mid= (l+h)/2;
		
		if(a[mid] == key){
			System.out.println("key location : " + mid);
		}
		
		if(a[l] < a[mid]){
			
			if (key>a[l] && key<a[mid]){
				return	search(a,l,mid-1,key);
			}
			
			return search(a,mid+1,h,key);
			
		}
		
		if(key> a[mid] && key<a[h])
			return search(a,mid+1,h,key);
		return	search(a,l,mid-1,key);
		
		
	}

}
