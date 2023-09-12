package com.java.oops.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		int[] nums = new int[3]; // [782, 0 , 0]

		nums[0] = 789;
		nums[0] = 784;
		nums[0] = 782;
//		nums[nums.length] = -8;

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);// 782 0 0
		}

		int[] primesTill10 = { 2, 3, 5, 7 };

		primesTill10[0] = 9;
		System.out.println(primesTill10[0]);
		System.out.println(primesTill10);
		
		System.out.println(Arrays.toString(primesTill10));//Arrays is utility class
		
//		String x ="suman";
//		System.out.println(x);

	}

}
