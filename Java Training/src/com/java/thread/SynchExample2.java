package com.java.thread;

import java.util.concurrent.locks.ReentrantLock;

class Table2 {

	ReentrantLock key = new ReentrantLock();

	void printTable2(int n) {
		System.out.println("Start execution");

		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

		System.out.println("END execution");
	}

	void printTable3(int n) {
		System.out.println("Start execution");

		key.lock();
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				key.lock();
				Thread.sleep(400);
				key.unlock();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		key.unlock();

		System.out.println("END execution");
	}

}

class MyThread6 extends Thread {

	int Table2num;
	Table2 Table2;

	MyThread6(Table2 Table2, int Table2Num) {
		this.Table2num = Table2Num;
		this.Table2 = Table2;

	}

	public void run() {
		Table2.printTable3(Table2num);
	}

}

public class SynchExample2 {
	public static void main(String[] args) {
		Table2 Table2 = new Table2();

		MyThread6 t1 = new MyThread6(Table2, 5);
		t1.start();

		MyThread6 t2 = new MyThread6(Table2, 100);
		t2.start();

		MyThread6 t3 = new MyThread6(Table2, 3);
		t3.start();

	}
}
