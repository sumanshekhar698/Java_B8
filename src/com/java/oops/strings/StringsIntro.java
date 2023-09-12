package com.java.oops.strings;

public class StringsIntro {

	public static void main(String[] args) {

		int x = 9;// primitive variable

//		Using String Literal
		String nameOfMovie = "pushpa2";// Strings are objects in Java AND they are immutable
		String nameOfMovie3 = "pushpa2";
		String nameOfMovie4 = "pushpa";

//		Using new Keyword

		String nameOfMovie2 = new String("pushpa2");
		String nameOfMovie5 = new String("pushpa2");

		System.out.println(nameOfMovie);
		System.out.println(nameOfMovie2);

		if (nameOfMovie == nameOfMovie4)// == wil not compare the object contents rather it will compare object address
			System.out.println("Equal");
		else
			System.out.println("Unequal");

		if (nameOfMovie == nameOfMovie3)// == wil not compare the object contents rather it will compare object address
			System.out.println("Equal");
		else
			System.out.println("Unequal");

		if (nameOfMovie == nameOfMovie2)
			System.out.println("Equal");
		else
			System.out.println("Unequal");

		if (nameOfMovie3.equals(nameOfMovie5))// equals method compares teh values in case of Strings
			System.out.println(true);

	}

}
