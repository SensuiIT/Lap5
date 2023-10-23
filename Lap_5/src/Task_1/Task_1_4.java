package Task_1;

public class Task_1_4 {

	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		// TODO
		int row = a.length;
		int col = a[0].length;
		int[][] result = new int[col][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[j][i] = a[i][j];
			}
		}
		return result;
	}
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 },{ 5, 6, 7 } };
		printMatrix(transpose(a));
	}
}
