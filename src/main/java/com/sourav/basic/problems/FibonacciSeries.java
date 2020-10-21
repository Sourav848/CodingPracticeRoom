package com.sourav.basic.problems;

import java.util.Scanner;

public class FibonacciSeries {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements");
		int element = sc.nextInt();
		System.out.print(n1+" "+n2);//printing 0 and 1
		printFibonacci(element);
	}

}
