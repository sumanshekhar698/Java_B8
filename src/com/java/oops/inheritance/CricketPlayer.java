package com.java.oops.inheritance;

public class CricketPlayer extends Player {
	// R1: Multiple inheritance is not possible in Java
	//	A single class can have only one parent but vice versa is not true

//	String name;
//	int age;
//	Gender gender;
	int runs;
	int wicket;

	public CricketPlayer(String name, int age, Gender gender, int runs, int wicket) {
		super(name, age, gender);// super always points to the immediate parent
		// in the above case it will invoke parent constructor
		this.runs = runs;
		this.wicket = wicket;
	}

	@Override
	public String toString() {
		return "CricketPlayer [runs=" + runs + ", wicket=" + wicket + ", name=" + name + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
