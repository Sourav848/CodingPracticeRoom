package com.sourav.array.problems;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
			System.out.println("ArrayInput:" + a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}				
}
