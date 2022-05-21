package com.java.thread;

class Table3 {
	// synchronize this - static synchronization
	void printTable(int n) {
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

class MyThread7 extends Thread {

	int tablenum;
	Table3 table;

	MyThread7(Table3 table, int tableNum) {
		this.tablenum = tableNum;
		this.table = table;
	}

	public void run() {
		table.printTable(tablenum);
	}

}

public class SynchExample4 {
	public static void main(String[] args) {

		Table3 tab1 = new Table3();
		MyThread7 t1 = new MyThread7(tab1, 5);
		t1.start();

		Table3 tab2 = new Table3();
		MyThread7 t2 = new MyThread7(tab2, 100);
		t2.start();

		Table3 tab3 = new Table3();
		MyThread7 t3 = new MyThread7(tab3, 3);
		t3.start();

	}
}
