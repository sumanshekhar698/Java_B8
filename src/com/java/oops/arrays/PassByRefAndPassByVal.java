package com.java.oops.arrays;

import java.util.Arrays;

public class PassByRefAndPassByVal {

	public static void main(String[] args) {

//		int x = 9;
//		changeInt(x);
//		System.out.println(x);

		int arr[] = { 43, 54, 6, 2, 4 };
		changeArr(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void changeInt(int x) {// pass by value
		System.out.println("-> " + x);
		x = 999;
	}

	private static void changeArr(int[] vvv) {// pass by refernce for all the Objects
		vvv[0] = -88;
//		System.out.println("-> " + x);

	}
}
