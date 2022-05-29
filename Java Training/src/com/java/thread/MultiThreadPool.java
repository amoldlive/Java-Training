package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExeThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName() + " >>  " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadPool {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			ExeThread work=new ExeThread();
			executor.execute(work);
		}

	}
}
