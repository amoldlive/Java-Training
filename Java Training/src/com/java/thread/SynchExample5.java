package com.java.thread;

import java.util.concurrent.locks.ReentrantLock;

class MyTable {
	// synchronize this
	ReentrantLock key=new ReentrantLock();
	
	void printTable(int n) {
		System.out.println("Start execution");
		key.lock();
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		key.unlock();
		System.out.println("END execution");
	}

}

class MyThread9 extends Thread {

	int tablenum;
	MyTable table;

	MyThread9(MyTable table, int tableNum) {
		this.tablenum = tableNum;
		this.table = table;
	}

	public void run() {
		table.printTable(tablenum);
	}

}

public class SynchExample5 {
	public static void main(String[] args) {
		MyTable table = new MyTable();

		MyThread9 t1 = new MyThread9(table, 5);
		t1.start();

		MyThread9 t2 = new MyThread9(table, 100);
		t2.start();

		MyThread9 t3 = new MyThread9(table, 3);
		t3.start();

	}
}
