package com.java.basics_java;//R1 : package seclaration is must

//R2: statemenst should end with a semicolon

//1. Rules
//2. Convetions

public class Main {// C1 class name should be in PascalCase

	public static void main(String[] args) {

		// Keywords are reserved words, which you cannot use as a variable name
		System.out.println("Hello World");

//		variables or primitive data types

//		integers are stored using 2s complement

		byte a = 127;// 1 byte = 8 bits [ -2^(n-1) to 2^(n-1)-1] where n is no of bits
//		 -2^7  to 2^7 - 1} = -128 to 127
		short b = 78;// 2 bytes
		int c = -709;// 4 bytes
		long d = 8996L;// 8 bytes
		long phone = 9006567388L; // 8 bytes

//		decimal numbers OR floating point numbers are stored usin IEEE algorithm
		
//		a = c;
		c = a;
		System.out.println(c);

		float pi = 3.14159F;// 4 bytes
		double piValue2 = 3.14159;// 8 bytes
		
		float phoneFloat = phone;//Corner Case
		System.out.println(phoneFloat);//9.0065674E9   :: 9.0065674 * 10^9 = 9006567400

//		boolean
		boolean isJavaEasy = false;
		isJavaEasy = true;// 1bit

		// char
		char ch = '^';//2bytes = 16 bits UTF16 charcters
		System.out.println(ch);
		int chInt = ch;
		System.out.println(chInt);
		
		int valueOfADozen = 12;//C2: variable name and function names are written in camelCase
		
//		Tuesday and Wednesday :: 1.5 to 2 hrs
		
		
		
		

	}

}

//TomAndJerry
