package nihar;

/*
 * You are given a 3 * 3 Matrix - 

3 -5  10 
6  2  -1 
2  6   1 

Q: Find the sum of the elements of each rows, and each column, and then display row number
   column number having the maximum sum and the minimum sum.
 */
public class ArrayMatrixCalculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{3,-5,10},
				          {6,2,-1},
				          {2,6,1}};
		
		int maxRow=0;
		int maxRowSum=0;
		int minRow=0;
		int minRowSum=0;
		int maxColumn=0;
		int maxColumnSum=0;
		int minColumn=0;
		int minColumnSum=0;
		
		minRowSum = matrix[0][0] + matrix[0][1] + matrix[0][2];
		minColumnSum = matrix[0][0] + matrix[1][0] + matrix[2][0];
		
		for(int i=0; i<3; i++) {
			int rowSum=0;
			int columnSum=0;
		    
		    for(int j=0; j<3; j++) {
		        rowSum+=matrix[i][j];            
		        columnSum+=matrix[j][i];
		    }
		    
		    if(rowSum>maxRowSum) {
		        maxRowSum=rowSum;
		        maxRow=i;
		    }
		    
		    if(columnSum>maxColumnSum) {
		        maxColumnSum=columnSum;
		        maxColumn=i;
		    }
		    
		    if(rowSum<minRowSum) {
		    	minRowSum=rowSum;
		        minRow=i;
		    }
		    
		    if(columnSum<minColumnSum) {
		        minColumnSum=columnSum;
		        minColumn=i;
		    }
		    
		}
		
		
		System.out.println("max row is "+ ++maxRow + " with "+ maxRowSum);
		System.out.println("min row is "+ ++minRow + " with "+ minRowSum);
		System.out.println("max column is " + ++maxColumn + " with "+ maxColumnSum);
		System.out.println("min column is " + ++minColumn+ " with "+ minColumnSum);
		
	}

}
