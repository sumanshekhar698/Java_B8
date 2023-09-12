package com.java.oops.arrays;

import java.util.Scanner;

public class Array1DIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Student you want to take input");
		int number = sc.nextInt();// integer input

		String[] names = new String[number];

		number = -333;
		sc.nextLine();//flushing
		for (int i = 0; i < names.length; i++) {// input

			System.out.println("Enter the name of " + i + "th Student");
			String name = sc.nextLine();
			names[i] = name;
		}

		System.out.println("The names of Entered Students are: ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
