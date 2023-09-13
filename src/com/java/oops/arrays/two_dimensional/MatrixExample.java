package com.java.oops.arrays.two_dimensional;

public class MatrixExample {

	public static void main(String[] args) {

		int mat1[][] = { { 3, 7 }, { 12, 3 }, { 8, 1 } };
		int[][] mat2 = new int[3][2];// 3*2 3 1D arrays and each 1D array is of size 2



		for (int i = 0; i < mat2.length; i++) {// all the 1D arrays

			for (int j = 0; j < mat2[i].length; j++) {
				System.out.print(mat2[i][j] + " ");
			}

			System.out.println();
		}
		
		int[][] mat3 = new int[3][];//3 1D array
		mat3[0] = new int[3];
		mat3[1] = new int[3];
		mat3[2] = new int[3];

		System.out.println(mat3[0].length);//

	}

}
