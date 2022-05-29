package com.java.thread;


class SampleThread extends Thread{
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("starting ... Daemon Thread : "+Thread.currentThread().getName());
		}else {
			System.out.println("starting ... Normal Thread "+Thread.currentThread().getName());
		}
	}
}
public class MultiThreadingExample8 {
	public static void main(String[] args) {
		SampleThread t1=new SampleThread();
		t1.setName("T1");
		SampleThread t2=new SampleThread();
		t2.setName("T2");
		SampleThread t3=new SampleThread();
		t3.setName("T3");
		
		//low priority
		//use for background task
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
