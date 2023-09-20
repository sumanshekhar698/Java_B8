package com.java.oops.static_concept;

public class TwoDArrayUtilityClasses {

	static public void print2DArray(int arr[][]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
