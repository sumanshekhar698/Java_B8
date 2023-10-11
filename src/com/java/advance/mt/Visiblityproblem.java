package com.java.advance.mt;

public class Visiblityproblem {

	public static void main(String[] args) {

		new Solution().call();
	}

}

class Solution {
	volatile boolean flag = true;

	void call() {
		// 3
		Thread t1 = new Thread(() -> {
			while (flag) {
				System.out.println("Stop me if ypu cann !!!!!");
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			flag = false;
		});
		t2.start();
	}
}
