package com.java.basics_java;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		vendingMachine: while (flag) {
			System.out.println("enter your favorite softdrink\n 1: Coke \n 2: Limca \n 3 : Maza \n 4: Pepsi \n 0:Exit");
			int input = sc.nextInt();

			switch (input) {
			case 1: {
				System.out.println("Enjoy Your coke");
				break;
			}
			case 2: {
				System.out.println("Enjoy Your Limca");
				break;
			}
			case 3: {
				System.out.println("Enjoy Your Mazza");
				break;
			}
			case 4: {
				System.out.println("Enjoy Your Pepsi");
				break;
			}
			case 0: {
				System.out.println("Thank You");
//				flag = false;
				break vendingMachine;
//				System.exit(67);
			}
			default: {
				System.out.println("Invalid Input");
				break;
			}
			}

		}

	}

}
