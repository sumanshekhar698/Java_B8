package com.java.oops.encapsulation;

public class Main {

	public static void main(String[] args) {

		BankUser user2 = new BankUser("John Doe", 9970);// parametrized constructors can be used to intialize instance
														// varaibels

//		System.out.println(user2.name);//
		
		System.out.println(user2.getAcNo());//

//		user2.name = "Monkey";
		
		user2.setAcNo(89888);
		System.out.println(user2.getName());//
		System.out.println(user2.getAcNo());//

		System.out.println(user2.hashCode());

	}

}
