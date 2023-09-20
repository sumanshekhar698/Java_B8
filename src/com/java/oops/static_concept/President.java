package com.java.oops.static_concept;

public class President {// Singelton Pattern
	private String name;
	private int age;
	private String country;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	private static President pres;

	private President(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	static President getInstance(String name, int age, String country) {
		if (pres == null)
			pres = new President(name, age, country);
		return pres;

	}

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

}
