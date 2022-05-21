package com.java.thread;

public class MultiThreadingExample4 {
	public static void main(String[] args) {

		Thread myThread = new Thread(new MyThread3());
		myThread.start();
		myThread.start(); // cant start thread twice throws exception

	}
}
