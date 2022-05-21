package com.java.thread;

class MyThread extends Thread{
	
	
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.print(i+"\t");	
		}
	}
	
}

public class MultiThreadingExample1 {
	public static void main(String[] args) {

		 MyThread myThread=new MyThread();
		 System.out.println(myThread.getName());
		 myThread.start();

		 MyThread myThread2=new MyThread();
		 System.out.println(myThread2.getName());
		 myThread2.start();

		 MyThread myThread3=new MyThread();
		 System.out.println(myThread3.getName());
		 myThread3.start();

		 MyThread myThread4=new MyThread();
		 System.out.println(myThread4.getName());
		 myThread4.start();

		 Thread thread=Thread.currentThread();
		 System.out.println(thread.getName());

	}
}
