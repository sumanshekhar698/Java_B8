package com.java.oops;

public class Main {

	public static void main(String[] args) {

		int x = 8;// local variable
		System.out.println(x);

		Car car1 = new Car();// instantiation/ object creation
//		Car car1; refrence/instance/object variable
		System.out.println(car1.mielage);// 0.0
		System.out.println(car1.color);// null

		car1.color = "Red";
		car1.model = "Honda Civic";
		car1.mielage = 14.4f;

		System.out.println(car1.mielage);// 14.4
		System.out.println(car1.color);// Red

		// 9006567388
		
		car1.commute();

	}

}
