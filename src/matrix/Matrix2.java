package matrix;

public class Matrix2 {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {  13, 14, 15,16 } };
		System.out.println(a.length);
		System.out.println(a[0].length);
		int row =4 ;
		int col =4 ;
		int[][] b = new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i%2==0)
					b[j][i]=a[i][j];
				else
					b[j][i]=a[i][col-j-1];
				
				//b[j][i]=a[i][j];
			}
		}
		printMatrix(a);
		printMatrix(b);
	}
	
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("Printing Array");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}

}
