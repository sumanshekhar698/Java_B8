package com.java.oops.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilityClasses {

	public static void main(String[] args) {

		int arr[] = { 23, 345, 45, 2423, 2, 2 };
		// Bubble Sort*, Merge Sort*, Insertion Sort*, Quick Sort, Shell Sort

		Arrays.sort(arr);// Ascending Order
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// bubble Sort [Optimized]

		Arrays.fill(arr, 0, 4 ,88);
		System.out.println(Arrays.toString(arr));

	}

}
