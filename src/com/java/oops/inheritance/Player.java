package com.java.oops.inheritance;

public class Player {

	String name;
	int age;
	Gender gender;
	
	
	public Player(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	

}

enum Gender {
	MALE, FEMALE
}
