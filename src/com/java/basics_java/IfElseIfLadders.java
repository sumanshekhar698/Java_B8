package com.java.basics_java;

public class IfElseIfLadders {

	public static void main(String[] args) {

		int x = 87;

		if (x > 0 && x < 20) {
			System.out.println("1");
		} else if (x < 30)
			System.out.println("2");
		else if (x < 40)
			System.out.println("3");
		else
			System.out.println("4");
		
		
		if(x > 4)
			System.out.println(5);
		if(x > 7)
			System.out.println(6);
		
	}

}
