package com.sourav.java.examples;



@FunctionalInterface // optional but not in case with multiple abstract method
public interface FunctionalInterfaceExample {
	
	public void m1();  //You can create an interface which is a set of abstract methods without using abstract keyword. 

	//public void m17();
	
	//public void m18();
	
	default void m2() {
		System.out.println("Default method-1");
	}

	default void m3() {
		System.out.println("Default method-2");
	}

	static void m4() {
		System.out.println("static method-1");
	}
	
	static void m5() {
		System.out.println("static method-1");
	}

}

