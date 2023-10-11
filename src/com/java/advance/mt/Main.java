package com.java.advance.mt;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");

		// 1
		Thread1 t1 = new Thread1();
		t1.setName("t1");
		t1.start();//5 is te deafault priority

		Thread1 t2 = new Thread1();
		t2.setName("t2");
		t2.start();
		t2.setPriority(8);

		// 2
		Thread t3 = new Thread(new Work2());
		t3.setName("t3");
		t3.start();
		t3.setPriority(Thread.MIN_PRIORITY);//1


		// 3
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {

				try {
					System.out.println("i -> " + i + " :: " + Thread.currentThread());
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t4.setName("t4");
		t4.start();
		t4.setPriority(Thread.MAX_PRIORITY);//10


//		for (int i = 0; i < 10; i++) {
//
//			try {
//				System.out.println("i -> " + i + " :: " + Thread.currentThread().getName());
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println("END");

	}

}

//1
class Thread1 extends Thread {// Worker

	@Override
	public void run() {// Work
		for (int i = 0; i < 10; i++) {

			try {
				System.out.println("i -> " + i + " :: " + Thread.currentThread());
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

//2
class Work2 implements Runnable {// Work

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				System.out.println("i -> " + i + " :: " + Thread.currentThread());
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
