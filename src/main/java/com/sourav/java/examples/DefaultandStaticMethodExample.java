package com.sourav.java.examples;


interface TestInterface1 {
	
	// Default method are only allowed in interfaces not in class
	 default void show()
    {
      System.out.println("Default TestInterface1");
    }
	  
    // Static Method
    static void hello() //cannot override
    {
        System.out.println("Called from Interface PrintDemo");
    }
}


interface TestInterface2 {
	
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}


public class DefaultandStaticMethodExample implements TestInterface1, TestInterface2 {
	
	public void show() {
		 
		 TestInterface1.super.show(); //avoid multiple inheritance, programmer calling explicitly which method.
		 
		 TestInterface2.super.show();
		 
	 }
	
	
	 // Class Static method is defined
    static void classHello()
    {
        System.out.println("Called from Class");
    }
	
	 public static void main(String[] args)
	    {
		 DefaultandStaticMethodExample defaultandStaticMethodExample = new DefaultandStaticMethodExample();
	        // Call Interface method as Interface
	        // name is preceding with method
		
		 TestInterface1.hello(); 
		 
		 defaultandStaticMethodExample.show(); // It is not mandatory to override default methods but here i am overriding.
		 
	        // Call Class static method
		 classHello();
	    }
}
