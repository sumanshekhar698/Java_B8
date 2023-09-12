package com.java.oops.strings.mutable;

public class BattleOfStrings {

	public static void main(String[] args) {

		String x = "";
		StringBuilder sb = new StringBuilder("");

//		for (int i = 0; i < 100000; i++) {
//			x += "pikachu ";
//		}
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			sb.append("pikachu ");
		}

		long end = System.nanoTime();

		System.out.println("Time Diff :: " + (end - start));
		// Time Diff :: 25,860,581,000 ns = 24.9 seconds
		// Time Diff :: 010,098,500 ns = 0.01 seconds

	}

}
