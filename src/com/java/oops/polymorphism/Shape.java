package com.java.oops.polymorphism;

public class Shape {

	void areaOfSquare(int side) {
		int area = side * side;
		System.out.println("Area Of Square :: " + area);
	}

	void areaOfCircle(float radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area Of Circle :: " + area);
	}

	float areaOfRectangle(int length, float breadth) {
		float area = length * breadth;
		System.out.println("Area Of Rectangle :: " + area);

		return area;
	}

	float areaOfTraingle(int base, float height) {
		float area = 0.5f * base * height;
		System.out.println("Area Of Triangle :: " + area);

		return area;
	}

}
