package com.java.oops.exceptions;

import java.util.Scanner;

public class HandlingExeption2 {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 2, 6, 8, 1, 0 };// 5
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("try <<");
//			System.exit(6);//finally will not execute
			System.out.println(8 / arr[scanner.nextInt()]);
			System.out.println("try >>");
		} finally {
			System.out.println("finally !!");
			scanner.close();
		}

		System.out.println("END");

	}

}
