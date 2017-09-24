package sreehari;

public class Test12 {

    static int[] oddNumbers(int l, int r) {
        int odds[] = new int[r];
        int j =0;
        for(int i=l; i<=r; i++) {
            if(i%2 ==1) {
                odds[j] = i;
                j++;
            }
        }
        int[] oddOri = new int[j];
        for(int i=0;i<=j;i++) {
            oddOri[i] = odds[i];
        }
        return oddOri;
    }

    public static void main(String[] args) {
    	int[] sree = Test12.oddNumbers(3, 5);
    	for (int i = 0; i < sree.length; i++) {
			System.out.println(sree[i]);
		}
    }
}
