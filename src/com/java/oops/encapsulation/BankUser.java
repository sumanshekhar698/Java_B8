package com.java.oops.encapsulation;

public class BankUser {

	private String name;
	private int acNo;
	String bankName;//default
	
	

	public String getName() {
		return name;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	BankUser() {
		System.out.println("constructor 0 prams called");
	}

	public BankUser(String name, int acNo) {// parametrized constructor
		this();// constructor chaining and thsi should be the 1st statement
		System.out.println("constructor pramaterized called");
		this.name = name;
		this.acNo = acNo;
	}

	public BankUser returnSameObject() {
		return this;
	}

}
