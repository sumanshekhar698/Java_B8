package com.java.oops.static_concept;

public class Main {

	public static void main(String[] args) {

		Toy toy1 = new Toy("Blue", ToyCategory.FLYING_TOYS, false);
		System.out.println(toy1.getDetails());
		System.out.println(toy1.brand);
		toy1.brand = "Hasbro";
		System.out.println(toy1.brand);// Hasbro
		toy1.getInfo();//

		Toy toy2 = new Toy("Yellow", ToyCategory.DOLLS, true);
		System.out.println(toy2.getDetails());
		System.out.println(toy2.brand);// Hasbro

		Toy.brand = "Ben 10";// Static variables should be accessed via class name
		System.out.println(toy1.brand);//
		System.out.println(toy2.brand);//
		System.out.println(Toy.brand);//
		Toy.getInfo();//

		final int x;
		x = 10;
//		x = 99;//fonal varibles inside a function cannnot be change once assinged a value
		System.out.println(Constants.PI);
//		Constants consants = new Constants();
		Employee emp1 = new Employee("John");
		Employee emp2 = new Employee("Jane");
		Employee emp3 = new Employee("Jim");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);



	}

}
