package com.java.oops.polymorphism;

public class ShapePolymorphic {// Compiletime polymorphism

	// If name of methods/fn are same
	// 1. no of parameters
	// 2. Type of Parameter
	// 3. Posn of parametere
	// * return type does not takle part in polymorphism

	// the area fn/method is overlaoded
	void area(int side) {// Polymorphism
		int area = side * side;
		System.out.println("Area Of Square :: " + area);
	}

	void area(float radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area Of Circle :: " + area);
	}

	float area(int length, float breadth) {
		float area = length * breadth;
		System.out.println("Area Of Rectangle :: " + area);

		return area;
	}

	float area(float height, int base) {
		float area = 0.5f * base * height;
		System.out.println("Area Of Triangle :: " + area);

		return area;
	}

}
