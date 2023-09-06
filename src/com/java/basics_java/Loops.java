package com.java.basics_java;

public class Loops {
	public static void main(String[] args) {

//		repetation ^recursion

//		EVEN 1 - 100
//		System.out.println(2);
//		System.out.println(4);
//		System.out.println(6);

//		for loop

		int i = 0;
		for (; i < 100; i += 2) {// initailization; condition;updation
//			if (i % 2 == 0)
			System.out.println(i);
		}

		System.out.println(i);

//		for (;true;) {
//			System.out.println("Hey !!");
//		}

//		DSA

//		while loop
		i = 1;
		while (i < 100) {
			System.out.println(i);
			i += 2;
		}

		do {
			System.out.println("Do While!!");
		} while (5 < 3);
	}

}
