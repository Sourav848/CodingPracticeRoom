package com.sourav.java.examples;

public class StringExcercise {
	
	public static void main(String[] args) {
	
	String string1 = new String("hello");
	String string2 = new String("hello");
	Object object1 = new Object();
	Object object2 = new Object();

	// Using Object's equals():
	if (!object1.equals(object2)) { // False, different object references
	  System.out.println("Objects are equal (using Object's equals())");
	}

	// Using String's equals():
	if (string1.equals(string2)) { // True, same string content
	  System.out.println("Strings are equal (using String's equals())");
	}
	
	String str1 = new String("Hello");
	String str2 = str1.concat(" World");

	System.out.println(str1); // Output: Hello
	System.out.println(str2); // Output: Hello World

	
	
	}

}
