package matrix;

public class MatrixInsertZeroes {

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 9, 10, 0, 11 }, { 12, 13, 14, 15 } };
		int n = matrix.length;
		boolean[] row = new boolean[n];
		boolean[] column = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		System.out.println("Matrix After Setting zero:-");
		printMatrix(matrix);

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