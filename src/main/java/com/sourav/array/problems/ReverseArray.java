package com.sourav.array.problems;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Define length of array in number");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Array in reverse order: ");
		// Loop through the array in reverse order
		/*
		 * for (int i = arr.length-1; i >= 0; i--) { System.out.print(arr[i] + " "); }
		 */

		int[] arr1 = reverseTheArray(arr, arr.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static int[] reverseTheArray(int[] arr, int n) {
		int inc = 0;
		int ar[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			ar[inc++] = arr[i];	
		}
		return ar;
	}
}