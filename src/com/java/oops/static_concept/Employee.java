package com.java.oops.static_concept;

public class Employee {
	String name;
	String ID;// EMP1, EMP2
	static int counter = 0;

	public Employee(String name) {
		this.name = name;
		this.ID = "EMP" + ++counter;
	}


	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + "]";
	}
	
	

}
