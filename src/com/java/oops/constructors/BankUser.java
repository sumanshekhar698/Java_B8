package com.java.oops.constructors;

public class BankUser {

	String name;
	int acNo;

	BankUser() {// BankUser constructor Oveloaded constructor
		System.out.println("constructor 0 prams called");
	}

	public BankUser(String name, int acNo) {// parametrized constructor
		this();// constructor chaining and thsi should be the 1st statement
		System.out.println("constructor pramaterized called");
		this.name = name;
		this.acNo = acNo;
	}

	BankUser returnSameObject() {
		return this;
	}

}
