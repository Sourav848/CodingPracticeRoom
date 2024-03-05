package com.sourav.algorithm.sorting.problems;

import java.util.Scanner;

//1. Select the smallest value in the list.
//2. Swap smallest value with the first value of the list.
//3. Again select the smallest value in the list(exclude first value).
//4. Swap the value with the second element of the list.
//5. Keep doing n-1 times to place all n values until it is sorted array.

public class SelectionSort {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}		
		for (int j = 0; j < n; j++) {
			int loc = selection_sort(arr, j, n);
				int temp = arr[j];
				arr[j] = arr[loc];
				arr[loc] = temp;
			} 
			System.out.println("Printing Sorted List ...");
			for (int i = 0; i < n; i++) {
				System.out.print(" " + arr[i]);
			}
	}

	static int selection_sort(int a[], int index, int n) {
		int locIndex = index,
			min = a[index];
			for (int j = index; j < n; j++) {
				if (a[j] < min) {
					min = a[j];
					locIndex = j;
				}	
		}
			return locIndex;
	}

}
