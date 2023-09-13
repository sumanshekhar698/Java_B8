package com.java.oops.arrays.two_dimensional;

public class Jagged2DArray {

	public static void main(String[] args) {

		int[][] jagged2Darray = new int[3][];

		jagged2Darray[0] = new int[2];
		jagged2Darray[1] = new int[3];
		jagged2Darray[2] = new int[1];

		for (int i = 0; i < jagged2Darray.length; i++) {// all the 1D arrays
			for (int j = 0; j < jagged2Darray[i].length; j++) {
				System.out.print(jagged2Darray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
