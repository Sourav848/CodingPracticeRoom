package com.sourav.java.examples;

interface InterfaceSample {
	
	// Public and abstract method of Interface
		void overrideMethod(String str);

	// Java program to demonstrate // static method in Interface.

	static void hello() {
		System.out.println("Hello, New Static Method Here");
	}

	
}

// Implementation Class public class InterfaceDemo implements
class InterfaceExample implements InterfaceSample {

	// Implementing interface method
	@Override
	public void overrideMethod(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		InterfaceExample interfaceDemo = new InterfaceExample();

		// Calling the static method of interface InterfaceExample.hello();

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");
		System.out.println(StaticKeywordExample.str);

	}

}