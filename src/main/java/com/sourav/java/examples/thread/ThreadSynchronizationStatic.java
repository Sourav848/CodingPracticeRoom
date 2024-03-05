package com.sourav.java.examples.thread;

class Table3 {
	static synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread5 extends Thread {
	public void run() {
		Table3.printTable(1);
	}
}

class MyThread6 extends Thread {
	public void run() {
		Table3.printTable(10);
	}
}

class MyThread7 extends Thread {
	public void run() {
		Table3.printTable(100);
	}
}

class MyThread8 extends Thread {
	public void run() {
		Table3.printTable(1000);
	}
}

public class ThreadSynchronizationStatic {
	public static void main(String t[]) {
		MyThread5 t1 = new MyThread5();
		MyThread6 t2 = new MyThread6();
		MyThread7 t3 = new MyThread7();
		MyThread8 t4 = new MyThread8();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
