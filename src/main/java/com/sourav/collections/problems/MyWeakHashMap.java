package com.sourav.collections.problems;

import java.util.HashMap;
import java.util.WeakHashMap;

public class MyWeakHashMap {

	class Demo {
		public String toString() {
			return "demo";
		}

		// finalize method
		public void finalize() {
			System.out.println("finalize method is called");
		}

	}

	void hashMapDemo() { // HashMap dominates over Garbage Collector.
		
		HashMap m = new HashMap();
		Demo d = new Demo();

		// puts an entry into WeakHashMap
		m.put(d, " Hi ");
		System.out.println(m);

		d = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 4 sec
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(m);
	}

	void weakHashMapDemo() { // Garbage Collector dominates over WeakHashMap.
		
		WeakHashMap m = new WeakHashMap();
		Demo d = new Demo();

		// puts an entry into WeakHashMap
		m.put(d, " Hi ");
		System.out.println(m);

		d = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 4 sec
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(m);
	}

	public static void main(String args[]) throws Exception {
		MyWeakHashMap myWeakHashMap = new MyWeakHashMap();
		myWeakHashMap.hashMapDemo();
		myWeakHashMap.weakHashMapDemo();
	}
}
