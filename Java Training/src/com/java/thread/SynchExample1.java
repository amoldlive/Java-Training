package com.java.thread;

class Table {
	// synchronize this
	synchronized void printTable(int n) {
		System.out.println("Start execution");
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("END execution");
	}

}

class MyThread5 extends Thread {

	int tablenum;
	Table table;

	MyThread5(Table table, int tableNum) {
		this.tablenum = tableNum;
		this.table = table;
	}

	public void run() {
		table.printTable(tablenum);
	}

}

public class SynchExample1 {
	public static void main(String[] args) {
		Table table = new Table();

		MyThread5 t1 = new MyThread5(table, 5);
		t1.start();

		MyThread5 t2 = new MyThread5(table, 100);
		t2.start();

		MyThread5 t3 = new MyThread5(table, 3);
		t3.start();

	}
}
