package com.java.thread;

public class MultiThreadingExample7 {
	public static void main(String[] args) {

		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyThread myThread3 = new MyThread();
		
	
		System.out.println("Priority T-1  :  "+myThread1.getPriority());
		System.out.println("Priority T-2  :  "+myThread2.getPriority());
		System.out.println("Priority T-3  :  "+myThread3.getPriority());
		
		myThread1.setPriority(1);
		myThread2.setPriority(3);
		myThread3.setPriority(7);
	
		
		System.out.println("\n Priority T-1  :  "+myThread1.getPriority());
		System.out.println("Priority T-2  :  "+myThread2.getPriority());
		System.out.println("Priority T-3  :  "+myThread3.getPriority());
		
		
		myThread1.start();
		myThread2.start();
		myThread3.start();

		Thread currentThread=Thread.currentThread();
		System.out.println("\n Name : "+currentThread.getName());
		System.out.println("main priority : "+currentThread.getPriority());
		currentThread.setPriority(1);
		System.out.println("main Priority : "+currentThread.getPriority());
		
		
		//invalid priority values
		//myThread1.setPriority(0); 
		//myThread1.setPriority(11);
		//myThread1.setPriority(17); 
	}
}
