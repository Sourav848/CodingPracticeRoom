package com.sourav.java.examples;

public class StaticKeywordExample {

	private static String str = "BeginnersBook";
    String str1 = "hello";
    
    StaticKeywordExample() { // cannot make constructor static or final
    	
    	str = "hee"; // It's not good practice, everytime class load will break the property of static keyword variable.
    	System.out.println(str);
    }
    
    
    
	// Static class
	static class MyNestedClass {
		// non-static method
		public void disp() {

			/*
			 * If you make the str variable of outer class non-static then you will get
			 * compilation error because: a nested static class cannot access non- static
			 * members of the outer class.
			 */
			System.out.println(str);
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
		obg1.staticMethod();
	}
}
