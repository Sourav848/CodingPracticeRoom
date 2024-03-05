package com.sourav.java.examples;

/**
 * This program is used to show that If 
 * the super class method does not declare
 * an exception then subclass overridden 
 * method cannot declare the checked exception
 * @author w3spoint
 */
 
class Parent{
	
	int x = 10;
	
	public Parent() {
		System.out.println("Super Class Constructor");
	}
	public void display(){
		System.out.println("Super class.");
	}
	
	public final void finalMethod(){
		System.out.println("Final Method cannot be overriden and will give compiler error.");
	}
	
	public static void staticMethod(){
		System.out.println("Static Method cannot be overriden but also won't give compiler error.");
	}
	
	private void privateMethod(){
		System.out.println("Private Method in Parent class");
	}
	
	public Parent covariantExampleOne(){
		System.out.println("Sample of covariant return types.");
		return new Parent();
	}
	
	public Object covariantExampleTwo(){
		System.out.println("Sample of covariant return type is parent");
		return null;
	}
	
}
 
class Child extends Parent {
	
	int x = 20;
	int y = 30;
	
	public Child() {
		System.out.println("SubClass Class Constructor");
	//	super(); - Will throw syntax error >> Constructor call must be the first statement in a constructor
	}
	//Compile time error here.
	public void display() throws ArithmeticException { // throws IOException = checked exception == will throw error
		System.out.println("Sub class.");
		super.display();
	}
	
	public Child covariantExampleOne(){
		System.out.println("Changing return type in method overriding with the help of covariant types.");
		return new Child();
	}
	
	public String covariantExampleTwo(){
		System.out.println("SampleTwo of covariant return type"); //String is child class of Object so superclass must have always parent return type
		return "different retutn types";
	}
	
	// @Override - if we use then it will throw CTE
	public static void staticMethod(){
		System.out.println("Static Method cannot be overriden in subclass but also won't give compiler error.");
	}
	
	public void m3() { // throws IOException = checked exception == will throw error
		System.out.println("Sub class.");
	}
}
public class OverridingDemo {
	public static void main(String args[]){
		//Creating subclass object.
		Parent parent = new Child();
		
		//Child child1 = (Child)new Parent(); //downcasting is not possible in Java throws RTE
 
		System.out.println("In this case parent value will be printed :"+parent.x);
		//method call.
		parent.display();
		parent.covariantExampleOne();
		parent.covariantExampleTwo();
		parent.staticMethod();
		Parent.staticMethod();
	//	subClass.m3(); - It throws compilation error because it's not present in parent class and also upcasting scenario
		
		Child child = new Child();//Downcasting is not supported
		child.m3(); //will work no upcasting is involved
		child.finalMethod();// final method can be inherit but not override
	//	child.privateMethod(); // private cannot be inherit and override it.
		
	}
}