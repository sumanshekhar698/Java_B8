package com.java.oops.exceptions;

public class ChekcedException {

	public static void main(String[] args) {

		System.out.println("START");
//		System.out.println(8/0);//UnChecked Exception
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {//Checked Exception
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		System.out.println("END");

	}

}
