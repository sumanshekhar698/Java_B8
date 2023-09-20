package com.java.oops.static_concept;

public class MainSingelton {

	public static void main(String[] args) {

//		new President();
		President pres = President.getInstance("Joe Biden", 70, "USA");
		System.out.println(pres);
		
		President pres2 = President.getInstance("Xin Ping", 60, "China");
		System.out.println(pres2);

	}

}
