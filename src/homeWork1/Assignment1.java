package homeWork1;
/*
 * Nir Avisror 311499958
 * Pinhas Ziv 315709139
 */

public class Assignment1 {

	public static void main(String[] args) {
		final int SIZE = 4;
		int[][] matrix = new int[SIZE][SIZE];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (21 * Math.random());
			}
		}
		show(matrix);
		System.out.println();
		ifSorted(matrix);
		ifsymmetrical(matrix);
		ifPositive(matrix);
	}
	
	// Exe 1
	/**
	 * The function checks whether the matrix rows are sorted, or the matrix columns
	 * are sorted, or whether the matrix is completely sorted, and prints a message
	 * accordingly.
	 * 
	 * @param arr: The matrix we want to check.
	 */
	public static void ifSorted(int[][] arr) {
		boolean sortedRows = true, sortedColumns = true;
		for (int i = 0; i < arr.length && sortedRows; i++) {
			for (int j = 0; j < (arr[i].length - 1) && sortedRows; j++) {
				if (arr[i][j] > arr[i][j + 1]) {
					sortedRows = false;
				}
			}
		}

		for (int i = 0; i < arr.length && sortedColumns; i++) {
			for (int j = 0; j < (arr[i].length - 1) && sortedColumns; j++) {
				if (arr[j][i] > arr[j + 1][i]) {
					sortedColumns = false;
				}
			}
		}
		if (sortedRows && !sortedColumns) {
			System.out.println("Matrix rows are sorted");
		} else if (sortedColumns && !sortedRows) {
			System.out.println("Matrix columns are sorted");
		} else if (sortedRows && sortedColumns) {
			System.out.println("The matrix is completely sorted");
		} else {
			System.out.println("The matrix is not sorted");
		}
	}

	// Exe 2
	/**
	 * The function checks whether the matrix is symmetrical or not and prints a
	 * message accordingly.
	 * 
	 * @param matrix: The matrix we want to check.
	 */
	public static void ifsymmetrical(int[][] matrix) {
		boolean symmetrical = true;
		if (matrix.length != matrix[0].length) {
			symmetrical = false;
		}

		for (int i = 0; i < matrix.length && symmetrical; i++) {
			for (int j = 0; j < matrix[i].length && symmetrical; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					symmetrical = false;
				}
			}
		}
		if (symmetrical) {
			System.out.println("The matrix is symmetrical");
		} else {
			System.out.println("The matrix is not symmetrical");
		}
	}

	// Exe 3
	/**
	 * A function that checks whether an array is positive or not.
	 * 
	 * @param arr: An array we want to check.
	 * @return a boolean value, whether the array is a positive array or not.
	 */
	public static void ifPositive(int[][] arr) {
		int sumDoalColumns = 0, sumOddRows = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j % 2 != 0) {
					sumDoalColumns += arr[i][j];
				}
				if (i % 2 == 0) {
					sumOddRows += arr[i][j];
				}
			}
		}
		if (sumDoalColumns > sumOddRows) {
			System.out.println("The matrix is positive");
		} else {
			System.out.println("The matrix is not positive");
		}
	}

	// Exe 4
	/**
	 * A function that prints a 2D array.
	 * 
	 * @param arr The array we want to print.
	 */
	public static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			showLine(arr[i]);
		}
	}
	
	/**
	 * A function that prints a 1D array.
	 * 
	 * @param arr: The array we want to print.
	 */
	public static void showLine(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
