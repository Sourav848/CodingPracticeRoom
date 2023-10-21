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
		System.out.println("Final Method cannot be overriden and will give compiler error.");
	}
	
	public static void staticMethod(){
		System.out.println("Static Method cannot be overriden but also won't give compiler error.");
	}
	
	public SuperClass covariantExampleOne(){
		System.out.println("Sample of covariant return types.");
		return new SuperClass();
	}
	
	public Object covariantExampleTwo(){
		System.out.println("Sample of covariant return type is parent");
		return null;
	}
}
 
class SubClass extends SuperClass {
	//Compile time error here.
	public void display() throws ArithmeticException { // throws IOException = checked exception == will throw error
		System.out.println("Sub class.");
	}
	
	public SubClass covariantExampleOne(){
		System.out.println("Changing return type in method overriding with the help of covariant types.");
		return new SubClass();
	}
	
	public String covariantExampleTwo(){
		System.out.println("SampleTwo of covariant return type"); //String is child class of Object so superclass must have always parent return type
		return "different retutn types";
	}
	
	// @Override - if we use then it will throw comip
	public static void staticMethod(){
		System.out.println("Static Method cannot be overriden in subclass but also won't give compiler error.");
	}
	
	
}
public class OverridingDemo {
	public static void main(String args[]){
		//Creating subclass object.
		SuperClass obj = new SubClass();
 
		//method call.
		obj.display();
		obj.covariantExampleOne();
		obj.covariantExampleTwo();
		obj.staticMethod();
		
	}
}