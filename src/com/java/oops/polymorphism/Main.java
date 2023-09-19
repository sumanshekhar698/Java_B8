package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.areaOfCircle(10.5f);
		shape.areaOfSquare(10);
		shape.areaOfRectangle(20, 10.5f);
		shape.areaOfTraingle(20, 10.5f);

		System.out.println("------------------------------------------------------");
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();// clean code, less functions to memorixe, enhanced
																	// code readilbily
		shapePolymorphic.area(7);//square
		shapePolymorphic.area(19.7f);

		System.out.println();// a fn which is polymorphic is called oveloaded fn

		// Polymorphism - Compiletime, Runtime

	}

}
