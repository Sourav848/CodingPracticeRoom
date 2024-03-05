package com.sourav.java.examples.thread;

class SampleThreadTwo extends Thread {
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(i);
			// will execute after 1 sec
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class SampleRunnableTwo implements Runnable {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("This is runnable class");
			// will execute after 1 sec
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}
	}
}