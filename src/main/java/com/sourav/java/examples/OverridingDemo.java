package com.sourav.java.examples;

// Link : https://www.w3spoint.com/exception-handling-with-method-overriding
/**
 * This program is used to show that If 
 * the super class method does not declare
 * an exception then subclass overridden 
 * method cannot declare the checked exception
 * @author w3spoint
 */
 
class SuperClass{
	public void display(){
		System.out.println("Super class.");
	}
	
	public final void finalMethod(){
		System.out.println("Final Method cannot be overriden and will five compiler error.");
	}
	
	public static void staticMethod(){
		System.out.println("Static Method cannot be overriden but also won't give compiler error.");
	}
}
 
class SubClass extends SuperClass {
	//Compile time error here.
	public void display() throws ArithmeticException { // throws IOException = checked exception == will throw error
		System.out.println("Sub class.");
	}
	
}
public class OverridingDemo {
	public static void main(String args[]){
		//Creating subclass object.
		SuperClass obj = new SubClass();
 
		//method call.
		obj.display();
		
	}
}