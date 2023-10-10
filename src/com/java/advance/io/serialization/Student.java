package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String uniName;//Static things cannot be serialized
	transient private int uan;
	int id;
	String name;

	public Student(int uan, int id, String name) {
		super();

		this.uan = uan;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [uniName=" + uniName + ", uan=" + uan + ", id=" + id + ", name=" + name + "]";
	}

}
