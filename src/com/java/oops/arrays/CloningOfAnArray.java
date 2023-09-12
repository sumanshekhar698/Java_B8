package com.java.oops.arrays;

import java.util.Arrays;

public class CloningOfAnArray {

	public static void main(String[] args) {

		int arr[] = { 23, 345, 45, 2423, 2, 2 };

//		int arr2[] = arr;
//

		int[] arr3 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
//		Arrays.fill(arr, -9);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr3));

		int[] arr4 = arr.clone();// This is only applicable for 1D arrays
		Arrays.fill(arr, -9);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr4));

	}

}
