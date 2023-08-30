package com.java.basics;

public class PrimitiveVariables {

	public static void main(String[] args) {

//		integers
		byte a = 127;// 1byte = 8 bits [bit 0|1]
		short b = 67;// 2 bytes = 16 bits
		int c = 678;// 4 bytes = 32 bits [generally we use int]
		long d = 867l;// 8 bytes = 64 bits [ -2^(n-1) to 2^(n-1) - 1] where is the value of no of bits

		long phoneNumber = 9006567388L;

//		decimals [floating point numbers] IEEE algorithm
		float x = 335.43534534F;// 4 bytes
		double y = 335.43534534;// 8 bytes

		System.out.println(x);
		System.out.println(y);

//		boolean data [1 bit ]
		boolean isJavaEasy = true;// 1
		isJavaEasy = false;// 0

//		charcter data

		/*
		 * • 65 - A • 97 - a • 48 - 0
		 */

		char characterA = 'A';
		System.out.println(characterA);
		int ascciCodeForA = characterA;
		System.out.println(ascciCodeForA);

		char rupeeSymbol = '₹';//JAVA uses Unicode System [2 bytes] UTF16 2^16 symbols
		System.out.println(rupeeSymbol);
		
		int utfCodeForRupee = rupeeSymbol;
		System.out.println(utfCodeForRupee);

	}

}
