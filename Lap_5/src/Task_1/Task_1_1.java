package Task_1;

import java.util.Arrays;

public class Task_1_1 {

	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
	// TODO
		
		int row = a.length;
		int col = a[0].length;
		int[][] result = new int[row][col];
		
		if(a.length != b.length || a[0].length != b[0].length) {
			throw new IllegalArgumentException("Khong co ket qua hay thu lai: ");
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		
	return result;
	
	}
	public static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a = {{7,2},
					{5,3}};
		int[][] b = {{2,1},
					{3,1}};
		printMatrix(add(a, b));
	}
}
