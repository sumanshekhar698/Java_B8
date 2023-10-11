package com.java.advance.mt;

public class StatesOfThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START " + Thread.currentThread() + " :: " + Thread.currentThread().getState());

		CustomThread t1 = new CustomThread();
		System.out.println("Before starting t1 " + t1 + " :: " + t1.getState());

		t1.start();
		t1.join();

		System.out.println("END " + Thread.currentThread() + " :: " + Thread.currentThread().getState());
		System.out.println("Last Line starting t1 " + t1 + " :: " + t1.getState());


	}

}

//1
class CustomThread extends Thread {// Worker

	@Override
	public void run() {// Work
		for (int i = 0; i < 10; i++) {

			try {
				System.out.println(
						"i -> " + i + " :: " + Thread.currentThread() + " :: " + Thread.currentThread().getState());
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
