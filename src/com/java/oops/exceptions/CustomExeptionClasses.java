package com.java.oops.exceptions;

import java.util.Scanner;

public class CustomExeptionClasses {

	public static void main(String[] args) {

		System.out.println("START");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age ::");
		int age = scanner.nextInt();
		boolean ans;
		try {
			ans = checkVotingEligilblity(age);
			System.out.println(ans);
		} catch (InvalidVotingAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static boolean checkVotingEligilblity(int age) throws InvalidVotingAge {
		if (age < 18)
			throw new InvalidVotingAge(" age " + age);
		return true;
	}

}

class InvalidVotingAge extends Exception {// 1

	public InvalidVotingAge(String message) {// 2
		super(message);
	}

}
