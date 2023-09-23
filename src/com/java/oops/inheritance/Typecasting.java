package com.java.oops.inheritance;

public class Typecasting {

	public static void main(String[] args) {
		Child child = new Child();
		child.test();

		Parent par = child;// Upcasting means the child will behave like a Parent, It is implicit
//		par.test();
		par.dummy();

		// Downcasting
		Parent par3 = new Parent();
		if (par3 instanceof Child) {
			Child child2 = (Child) par3;// Downcasting is not possible here
		}

		Parent par2 = new Child();// Upcasting

		if (par2 instanceof Child) {
			Child child3 = (Child) par2;
			child3.dummy();
			child3.test();
		}

	}

}

class Parent {
	int x;

	void dummy() {
		System.out.println("Parent Dummy");
	}
}

class Child extends Parent {

	int y;

	void test() {
		System.out.println("Testing Child");
	}
}
