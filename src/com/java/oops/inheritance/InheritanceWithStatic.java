package com.java.oops.inheritance;

public class InheritanceWithStatic {

	public static void main(String[] args) {
		N n = new N();
		n.test();
		
	}
}

class M{
	
	static void test() {
		System.out.println("testing M");//static things gets INHERITED
	}
}

class N extends M{

//	@Override
	static void test() {//Method Hiding , the parent test() is getting hidden
		System.out.println("testing N");//static things gets INHERITED
	}
}