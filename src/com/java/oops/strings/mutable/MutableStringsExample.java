package com.java.oops.strings.mutable;

public class MutableStringsExample {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("pikachu");
		StringBuffer sb2 = new StringBuffer();//is favoured in MultiThreaded programs

		sb1.append(" squirtle");
		System.out.println(sb1);
		
		char charAt = sb1.charAt(3);
		System.out.println(charAt);
		
//		sb1.reverse();		
		
		sb1.delete(3, 6);
		System.out.println(sb1);
		
		sb1.replace(3, 6, "ach");
		System.out.println(sb1);

		
		//WAP to reverse a String manualy
		//WAP to check if a String is Palindrome  "RADAR"

	}

}
