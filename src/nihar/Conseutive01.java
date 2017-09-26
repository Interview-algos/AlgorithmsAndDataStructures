package nihar;

public class Conseutive01 {

	static int[] a = {0,1,1,0,0,0,1,1,1,0,0,1,0};
    
    public static void main(String[] args) {
        int count = 0;
        int max  = 0 ;
        
        for(int i = 0 ; i< a.length ; i++){
           if(a[i] == 0){
               count = 0;
           } else {
               count++;
               if(count > max)
                   max = count;
           }
        }
        
        System.out.println("Max consecutive 1s is: "+max);
    }
}
