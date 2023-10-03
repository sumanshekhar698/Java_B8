package com.java.oops.exceptions;

import java.util.Scanner;

public class HandlingExeption {

	static int counter = 0;

	public static void main(String[] args) {

//		call();// Error
		System.out.println("START");
		int[] arr = { 2, 6, 8, 1, 0 };// 5
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("try <<");
//			System.exit(6);//finally will not execute
			System.out.println(8 / arr[scanner.nextInt()]);
			System.out.println("try >>");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// c-p
			e.printStackTrace();
			System.out.println("catch <1<");
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("catch <2<");
//		} 
		catch (Exception e) {// default catch block
			e.printStackTrace();
			System.out.println("catch <3<");
		} finally {
			System.out.println("finally !!");
			scanner.close();
		}

		System.out.println("END");

	}

	private static void call() {
		System.out.println("call() << " + ++counter);// 1
		call();// recursion
		System.out.println("call() >>");
	}

}
