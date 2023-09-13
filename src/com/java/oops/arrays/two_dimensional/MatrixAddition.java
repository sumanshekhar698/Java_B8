package com.java.oops.arrays.two_dimensional;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] mat1 = { { 32, 43 }, { 23, 564 }, { 64, 32 } };// 3*2
		int[][] mat2 = { { 43, 13 }, { -21, 23 }, { 12, 3452 } };// 3*2
		int[][] mat3 = { { 43, 13, 53 }, { -21, 23, 53 }, { 12, 3452, 645 } };// 3*3

		int rows = mat1.length, columns = mat1[mat1.length - 1].length;

		// substraction/ *multiplication / determinant/ inverse of matrix
		int result[][];
		// Symetric mat1, mat2
		if (mat1.length == mat2.length && mat1[mat1.length - 1].length == mat2[mat2.length - 1].length) {
			System.out.println("Adding 2 matrix of dimension [" + rows + " * " + columns + "]");
			result = new int[rows][columns];

			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = mat1[i][j] + mat2[i][j];

				}
			}

			for (int i = 0; i < result.length; i++) {// all the 1D arrays
				for (int j = 0; j < result[i].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("Not elligible for addition");
		}

	}

}
