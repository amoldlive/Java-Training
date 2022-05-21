package com.java.thread;

class MyThread3 implements Runnable {

	@Override
	public void run() {
		String str = "Blackbird singing in the dead of night";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class MultiThreadingExample3 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new MyThread3());
		t1.start();

		// Thread t2=new Thread(new MyThread3());
		 //t2.start();

	}
}
