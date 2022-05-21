package com.java.thread;

class MyThread2 implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
	}

}

public class MultiThreadingExample2 {
	public static void main(String[] args) {

		 MyThread2 MyThread2=new MyThread2();
		 Thread t1 = new Thread(MyThread2,"T1");
		 System.out.println(t1.getName());
		 t1.start();

		 Thread t2 = new Thread(new MyThread2(),"T2");
		 System.out.println(t2.getName());
		 t2.start();

		 Thread t3 = new Thread(new MyThread2(),"T3");
		 System.out.println(t3.getName());
		 t3.start();

	}
}
