package com.sourav.java.examples.thread;



public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		
		final String resource1 = "ratan jaiswal";
		final String resource2 = "vimal jaiswal";
		
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");

					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");

					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
	//  t1.join(); //- to avoid deadlock
		t2.start();
		
		//Solution : in t2 of synchronized block pass same as t1. i.e. 1st - resource1, 2nd - resource2
	}
}