package com.sourav.algorithms.sorting.problems;

import java.util.*;

//In this algorithm, we insert each element onto its proper place in the sorted array. 
//Best Time Complexity: O(N) // Worst/average: O(n2).


public class InsertionSort {
	
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && temp <= a[j]) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = temp; 
		}
	}
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		insertionSort(arr, n);
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
