package com.java.oops.exceptions;

import java.util.Scanner;

public class AutoResourceClosing {

	public static void main(String[] args) {
		System.out.println("START");
		int[] arr = { 2, 6, 8, 1, 0 };// 5

		try (Scanner scanner = new Scanner(System.in);) {// try with resource is applciable to every eety child of
															// AutoCloseable
			System.out.println("try <<");
			System.out.println(8 / arr[scanner.nextInt()]);
			System.out.println("try >>");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
