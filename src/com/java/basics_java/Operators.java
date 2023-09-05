package com.java.basics_java;

public class Operators {

	public static void main(String[] args) {

//		Mathematical Operators
		int x = 8;// assingment operator
		x = x * 9;
		x = 7 + 88;// * - + /
		x = 68 % 5;
		System.out.println(x);

//		Unary operatos
		int y = 100;// 100 -> 101 -> 102
		y++;// post increment +1
		System.out.println(y);// 101
		System.out.println(y++);// 101
		System.out.println(y);// 102
		y = 100;

		++y;
		System.out.println(y);// 101
		System.out.println(++y);// 102

		--y;// 101
		System.out.println(y--);// 101
		// 100
		System.out.println(y);

		y = 10;// 8
		x = 20;// 19

		// = 19 + 9 - 10 - 10 + 18 - 18 + 9;
		x = --x + --y - ++y - y-- + --x - x++ + y--;// 16, 17, 6, -17
		System.out.println(x);// 17

//		ShortHand Operators
		x = x + 7;
		x += 7;

		x %= 8; // x = x % 8

		x = 87;

//		==  --> comparison opertaor
		if (x > 0 && x % 2 == 0) {// pring true only if no > 0 and even
//		if ( x % 2 == 0 && x > 0 )// placing of condition in vital 
			// if else ladder
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		if (x % 2 == 0 || x > 0)
			System.out.println("true");
		else
			System.out.println("false");

		if (!(x != 100))
			System.out.println(true);
		else
			System.out.println(false);

//		&& ---> Logical AND

//		>  <  >=  <= !=  //Fira Code

	}

}
