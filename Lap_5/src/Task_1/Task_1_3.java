package Task_1;

public class Task_1_3 {
 
	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
	// TODO
		int rowA = a.length;
		int colA = a[0].length;
		int rowB = b.length;
		int colB = b[0].length;
		
		int[][] result = new int[rowA][colB];
		
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				int sum = 0;
				for (int k = 0; k < colA; k++) {
					sum += a[i][k] * b[k][j];
				}
				result[i][j] = sum;
			}
		}	
		return result;
	}
	public static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int num : row) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };
		printMatrix(multiply(a, b));
	}
}
