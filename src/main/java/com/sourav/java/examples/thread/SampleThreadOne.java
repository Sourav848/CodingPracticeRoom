package com.sourav.java.examples.thread;

class SampleThreadOne extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			// will execute after 1 sec
			try {
				sleep(1000);
			} catch (Exception e) {
			}

		}
	}
}

class SampleRunnableOne implements Runnable {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("Print Runnable Implementation");
			// will execute after 1 sec
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}
	}
}
