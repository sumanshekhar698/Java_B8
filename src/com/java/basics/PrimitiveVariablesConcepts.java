package com.java.basics;

public class PrimitiveVariablesConcepts {

	public static void main(String[] args) {

		short s = 87;// 2 bytes
//		byte b = s;// 1bytes //COMPILE ERROR
//		System.out.println(b);// 5 87

		int dozen = 12;// 4 bytes
//		short s = dozen;//2 bytes
//		System.out.println(s);// 12 CE

		long x = dozen;// 8 bytes TYPECASTING IMPLICIT
		System.out.println(x);// 12

		long phoneNumber = 9006567388L;// 8 bytes
		System.out.println(phoneNumber);

//		integers are stored in memory uisng an ALGO called 2s complement
//		floating points or decimals are stored in memory uisng an ALGO called IEEE [very powerful algo]

		float f = 3.1415F;// 4 bytes
//		phoneNumber = 89;
		f = phoneNumber;// CE
		System.out.println(f);// 9.0065674E9 = 9.0065674 * 10^9 = 9006567400

//		boolean ans =false;
//		int ansInt = (int) ans;

		char m = 'X';
		int mChar = m;
		System.out.println(mChar);

		int randomUTF = 14567;
		char randomUTFChar = (char) randomUTF;// EXPLICIT TYPE CASTING
		System.out.println(randomUTFChar);

//		NUMBER SYSTEM - A WAY TO REPRESENT NUMBERS
//		BINARY [2 symbols (0,1)] base2
		int binaryFor77 = 0B1001101;// prefix is 0b OR 0B
		System.out.println(binaryFor77);// 77

//		OCTAL [8 symbols (0 - 7)] base8
		short sh = 023461;// prefix here is 0
		System.out.println(sh);

//		DECIMAL [10 symbols (0 - 9)] base10 (default System for Java)
		int p = 3285;

//		HEXADECIMAL [16 symbols (0 - 9) U (A - F)] base16
		int h = 0x9AB897C;//prefix is 0x OR 0X
		System.out.println(h);

	}

}
