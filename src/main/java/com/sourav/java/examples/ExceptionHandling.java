package com.sourav.java.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

	static public int someMethod1(int i) {
		try {
			return i++;
		} catch (Exception e) {
			return i + 1;
		} finally {
			System.out.println("Finally Block of First Method");
			return i + 2; // 4
		}
	}

	static public void someMethod2(int n) {
		for (int i = 1; i <= n; i++) {
			try {
				int c = i / 0;
			} catch (ArrayIndexOutOfBoundsException ex) { // multiple catch block
				System.out.println("Handling index out of bond exception");
			} catch (RuntimeException ex) { // writing try block inside catch block
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

	static void nestedTryblock() {
		try {
			// Outer try block
			int[] numbers = { 1, 2, 3 };
			// System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException

			try {
				// Inner try block
				String name = null;
				System.out.println(name.toUpperCase()); // NullPointerException
			} catch (NullPointerException e) {
				System.out.println("NullPointerException caught: " + e.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		} finally {
			// Code that always executes, regardless of exceptions
			System.out.println("This code always runs.");
		}
	}
	
	public static void method1TryWithResource() {
        // Using try-with-resources with BufferedReader (in-built Java class)
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle IOException
        	System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void method2TryWithResource() {
        // Using try-with-resources with a custom class implementing AutoCloseable
        try (CustomResource resource = new CustomResource()) {
            resource.doSomething();
        } catch (Exception e) {
            // Handle exceptions
        	System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
 // Custom class implementing AutoCloseable
    static class CustomResource implements AutoCloseable {
        public void doSomething() {
            System.out.println("Doing something with custom resource.");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Closing custom resource.");
        }
    }

	public static void main(String args[]) {
		System.out.println(someMethod1(1));
		System.out.println();
		someMethod2(2);
		System.out.println();
		someMethod3(3);
		System.out.println();
		nestedTryblock();
		
		System.out.println();
		method1TryWithResource();
		method2TryWithResource();
	}
}
