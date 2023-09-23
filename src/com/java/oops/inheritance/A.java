package com.java.oops.inheritance;

//public class A extends B {//Cyclic Inheritance is not possibel anywhere

//
//}

class A extends Object {
	int x = 8;
	private boolean secret = true;

	public static void main(String[] args) {

		C c = new C();
		c.printX();
		c.test();
//		System.out.println(c.secret);//private things cannot be inherited

	}

}

class B extends A {

	int x = 7;

	void test() {
		System.out.println("testing  B");
	}
}

class C extends B {// Multi Level Inheritance is Possible in Java
	int x = 6;

	void printX() {// specialized method/fn
		System.out.println(x);
		System.out.println(super.x);// super can only be used to access immediate parent
		test();
//		super.test();
	}

	@Override
	void test() {// Method overridng is Runtime Polymorphism
		System.out.println("testing C");
	}

}
