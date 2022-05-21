package com.java.thread;

public class MultiThreadingExample6 {
	public static void main(String[] args) {

		Thread myThread = new Thread(new MyThread3());

		// T-Naming
		System.out.println("T-Name : " + myThread.getName());
		myThread.setName("MyThread-1");
		System.out.println("T-Name : " + myThread.getName());

		System.out.println("T-Id : " + myThread.getId());

		System.out.println("T-Priority : " + myThread.getPriority());
		myThread.setPriority(10);
		System.out.println("T-Priority : " + myThread.getPriority());

		// MIN_PRIORITY =1
		// NORM_PRIORITY=5 //default
		// MAX_PRIORITY=10

		//System.out.println("T-is Alive : " + myThread.isAlive());

		System.out.println("T-is Daemon : " + myThread.isDaemon());
		//myThread.setDaemon(true);
		
		System.out.println("T-is Inturruptued : " + myThread.isInterrupted());

		System.out.println("T- state : " + myThread.getState());
		myThread.start();
		System.out.println("T-state : " + myThread.getState());

	}
}
