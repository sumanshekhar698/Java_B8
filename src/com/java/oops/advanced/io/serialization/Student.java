package com.java.oops.advanced.io.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static String universityName;// static things dont take part in serializae
	transient private int universityNumber;
	String fullName;
	

	int id;

	public Student(int universityNumber, String fullName, int id) {
		super();
		this.universityNumber = universityNumber;
		this.fullName = fullName;
		this.id = id;
	}

	static void readuniversityName() {
		System.out.println(universityName);
	}

	@Override
	public String toString() {
		return "Student [universityNumber=" + universityNumber + ", fullName=" + fullName + ", id=" + id + "]";
	}

}
