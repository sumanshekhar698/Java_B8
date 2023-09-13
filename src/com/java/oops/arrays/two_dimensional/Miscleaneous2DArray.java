package com.java.oops.arrays.two_dimensional;

import java.util.Arrays;

public class Miscleaneous2DArray {

	public static void main(String[] args) {
		int[][] mat1 = { 
				{ 32, 43 }, 
				{ 23, 564 },
				{ 64, 32 } };// 3*2

		System.out.println(Arrays.toString(mat1));
		
		for (int i = 0; i < mat1.length; i++) {
			System.out.println(Arrays.toString(mat1[i]));
		}

	}

}
