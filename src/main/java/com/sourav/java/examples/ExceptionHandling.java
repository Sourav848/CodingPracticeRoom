package com.sourav.java.examples;

public class ExceptionHandling {

	static public int someMethod1(int i) {
		try {
			return i++;
		} catch (Exception e) {
			return i + 1;
		} finally {
			System.out.println("Finally Block of First Method");
			return i+2; //4
		}
	}
	
	static public void someMethod2(int n) {
		for (int i=1; i<=n; i++) {
		try {
			int c  = i/0;
		} catch (ArrayIndexOutOfBoundsException ex) { //multiple catch block
			System.out.println("Handling index out of bond exception"); 
		} catch (RuntimeException ex) { //writing try block inside catch block
				try {
					int c = i / 0;
				} catch (ArithmeticException ey) {
					System.out.println("try inside catch");
				}
				System.out.println("catch two Block");
			
			} finally {
			System.out.println("Finally Block of Second Block");
		}
		
		}
	}
	
	// only for sample
	static public int someMethod3(int i) {
		try {
			return i;
		} finally {
			System.out.println("Finally Block of third Method");
		}
	}
	
	

	public static void main(String args[]) {
		System.out.println(someMethod1(1));
		System.out.println();
		someMethod2(3);
		System.out.println();
		someMethod3(3);
	}
}
