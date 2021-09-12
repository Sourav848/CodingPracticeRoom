package com.sourav.java.examples;


//Java program implements method inside method
public class InnerClassAndInnerMethod {
	
		// function have implementation of another
		// function inside local class
		static void Foo()
		{
			// local class
			class Local {
				void fun()
				{
					System.out.println("geeksforgeeks");
				}
			}
			new Local().fun();
		}
		public static void main(String[] args)
		{
			//InnerClassAndInnerMethod innerClassAndInnerMethod = new InnerClassAndInnerMethod();
			Foo();
		}
	}


//Non static Nested class is called inner class.
//static Nested class is called Nested class.
//Nested class and Nested method is possible in java
