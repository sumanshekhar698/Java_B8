package com.java.oops.arrays;

import java.util.Arrays;

public class StringArgs {

	public static void main(String... suman) {// args array is used to take runtime arguments
		System.out.println(suman.length);

		for (int i = 0; i < suman.length; i++) {
			System.out.println(suman[i]);
		}

		test("suman", 5, 2, 543, 45, 64,77);
		
		//Bubble Sort
	}

	static void test(String y, int... x) {// var args
		System.out.println(Arrays.toString(x));
		System.out.println(y);
	}

}
