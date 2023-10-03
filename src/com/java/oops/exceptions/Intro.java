package com.java.oops.exceptions;

import java.util.Scanner;

public class Intro {

	static int counter = 0;

	public static void main(String[] args) {

//		call();// Error
		System.out.println("START");
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("try <<");
			System.out.println(8 / scanner.nextInt());
			System.out.println("try >>");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch <<");
		}
		System.out.println("END");

	}

	private static void call() {
		System.out.println("call() << " + ++counter);// 1
		call();// recursion
		System.out.println("call() >>");
	}

}
