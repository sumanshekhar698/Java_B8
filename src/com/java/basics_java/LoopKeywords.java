package com.java.basics_java;

public class LoopKeywords {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0)
				continue;
			System.out.print(i + " ");// skip all the numbers which are multiple of 5

		}

		System.out.println();

		for (int i = 1; i < 100; i++) {
			if (i == 50)
				break;
			System.out.print(i + " ");// if the number equals 50; stop the loop

		}

	}

}
