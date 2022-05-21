package com.java.thread;

class Table2 {
	// synchronize this
	void printTable(int n) {
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

}

class MyThread6 extends Thread {

	int tablenum;
	Table2 table;

	MyThread6(Table2 table, int tableNum) {
		this.tablenum = tableNum;
		this.table = table;
	}

	public void run() {
		table.printTable(tablenum);
	}

}

public class SynchExample2 {
	public static void main(String[] args) {
		Table2 table2 = new Table2();

		MyThread6 t1 = new MyThread6(table2, 5);
		t1.start();

		MyThread6 t2 = new MyThread6(table2, 100);
		t2.start();

		MyThread6 t3 = new MyThread6(table2, 3);
		t3.start();

	}
}
