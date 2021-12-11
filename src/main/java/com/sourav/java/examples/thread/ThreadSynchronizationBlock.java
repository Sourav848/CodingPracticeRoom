package com.sourav.java.examples.thread;

class Table2 {
	void printTable(int n) {
		synchronized (this) {// synchronized block   <<------------------------------
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
}

class MyThread3 extends Thread {
	Table2 t;

	MyThread3(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread4 extends Thread {
	Table2 t;

	MyThread4(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class ThreadSynchronizationBlock {
	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		
		t1.start();
		t2.start();
	}
}