package com.java.oops.static_concept;

public class Toy {

	String color;
	ToyCategory category;// car, dolls, flying
	boolean isChildSafe;
	static String brand;// they are class level not object level

	static {// static block executes even before constructors
		System.out.println("static block executed");
		brand = "Mittel";
	}

	public Toy(String color, ToyCategory category, boolean isChildSafe) {
		this.color = color;
		this.category = category;
		this.isChildSafe = isChildSafe;
	}

	public String getDetails() {
		getInfo();
		return "Toy [color=" + color + ", category=" + category + ", isChildSafe=" + isChildSafe + "]";
	}

	static void getInfo() {// non static things should not be accessed for static DIRECTLY
		System.out.println("BRAND :: " + brand);
	}

}
