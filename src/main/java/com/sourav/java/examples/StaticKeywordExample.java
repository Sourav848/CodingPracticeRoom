package com.sourav.java.examples;

public class StaticKeywordExample {

   static String str = "BeginnersBook";
    String str1 = "hello";
    
    StaticKeywordExample() { // cannot make constructor static or final
    	
    	str = "hee"; // It's not good practice, everytime class load will break the property of static keyword variable.
    	System.out.println(str);
    }
    
    
    
	// Static class
	static class MyNestedClass {
		// non-static method
		StaticKeywordExample staticKeywordExampleq = new StaticKeywordExample();
		public void disp() {
			/*
			 * If you make the str variable of outer class non-static then you will get
			 * compilation error because: a nested static class cannot access non- static
			 * members of the outer class.
			 */
			System.out.println(str);
			System.out.println("Accessing non-static variable : "+staticKeywordExampleq.str1); //Cannot access directly
		}

	}
	
	/*void lelo() {
		
		str1="";
		str = "";
	}*/
	
	public static void staticMethod() {
		/*
		 * a static method also cannot access non- static members of the outer class.
		 */
		//System.out.println(str1); //error
	}
	
	
	
	//static block - It will be executed first in program and can have multiple static block
	
	static {
	      System.out.println("In static block first");
	   }
	
	static {
	      System.out.println("In static block second");
	   }

	public static void main(String args[]) {
		/*
		 * To create instance of nested class we didn't need the outer class instance
		 * but for a regular nested class you would need to create an instance of outer
		 * class first
		 */
		StaticKeywordExample.MyNestedClass obj = new StaticKeywordExample.MyNestedClass();
		obj.disp();
		//Accessing static variable without creating instance of class
		System.out.println(StaticKeywordExample.str);
		
		staticMethod();
		
		StaticKeywordExample obg1 = new StaticKeywordExample();
		obg1.staticMethod(); //don't use it like that.
	}
}
