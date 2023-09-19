package com.java.oops.constructors;

public class Main {

	public static void main(String[] args) {
//		BankUser user1 = new BankUser();
//		System.out.println(user1.name);// null
//		System.out.println(user1.acNo);// 0
//
//		user1.name = "Jane Doe";
//		user1.acNo = 7900707;
//
//		System.out.println(user1.name);// Jane Doe
//		System.out.println(user1.acNo);// 7900707

		BankUser user2 = new BankUser("John Doe", 9970);// parametrized constructors can be used to intialize instance
														// varaibels

		System.out.println(user2.name);//
		System.out.println(user2.acNo);//
		
		System.out.println(user2.hashCode());
		
		BankUser user2_ = user2.returnSameObject();
		System.out.println(user2_.hashCode());


	}

}
