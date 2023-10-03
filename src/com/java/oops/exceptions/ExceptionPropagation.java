package com.java.oops.exceptions;

public class ExceptionPropagation {

	public static void main(String[] args)  {//DEH

		try {
			callA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void callA() throws InterruptedException {

		System.out.println("A");
		callB();
	}

	private static void callB() throws InterruptedException {
		System.out.println("B");

		callC();
	}

	private static void callC() throws InterruptedException {
		System.out.println("C");
		System.out.println(9/0);//ArithmeticException
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}

	}

}
