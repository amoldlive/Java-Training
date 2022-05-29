package com.java.thread;

class OwnThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread: " + Thread.currentThread().getName());
			}

			catch (Exception ex) {
				System.out.println("Exception has been caught" + ex);
			}
			System.out.println(i);
		}
	}
}

public class MultiThreadingExample9 {
	public static void main(String[] args) {

		OwnThread t1 = new OwnThread();
		t1.setName("T-1");

		OwnThread t2 = new OwnThread();
		t2.setName("T-2");

		OwnThread t3 = new OwnThread();
		t3.setName("T-3");

		// t1.start();
		// t2.start();
		// t3.start();

		// join - lets wait to finish this thread execution

		t3.start(); // first start

		try {
			t3.join(); // then join
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		t1.start();
		t2.start();

	}
}
