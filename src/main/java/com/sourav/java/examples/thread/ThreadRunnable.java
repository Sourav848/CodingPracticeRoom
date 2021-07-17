package com.sourav.java.examples.thread;

public class ThreadRunnable {

	public static void main(String[] args) {
		//SampleRunnableOne obj1 = new SampleRunnableOne();
		//SampleRunnableTwo obj2 = new SampleRunnableTwo();
		
		
		/**/
		
		Runnable obj1 = () -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);}catch(Exception e){}
			}
		};

		Runnable obj2 = () -> {  //run() method call then it means in running state
			for (int i = 0; i < 4; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception e){} // sleep() method call means it is in Non-Runnable (Blocked) state
			}
		};

		// obj1 is obj of Runnable
		Thread t1 = new Thread(obj1);//new state (also use to create thread)
		Thread t2 = new Thread(obj2);
		t1.start();//runnable state
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
		
	}

}
