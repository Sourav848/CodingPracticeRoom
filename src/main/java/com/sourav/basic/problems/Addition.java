package com.sourav.basic.problems;

import java.util.Scanner;

public class Addition {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		
		System.out.println("sum of a & b is = " + sum);
		
	}
}
