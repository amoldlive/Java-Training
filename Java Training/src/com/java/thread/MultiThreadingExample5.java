package com.java.thread;

public class MultiThreadingExample5 {
	public static void main(String[] args) {
		
		MyThread myThread1=new MyThread();
		myThread1.run(); //will not create any thread
		
		
		MyThread myThread2=new MyThread();
		myThread2.run(); //will not create any thread
		
		
		MyThread myThread3=new MyThread();
		myThread3.run(); //will not create any thread
		
	}
}
