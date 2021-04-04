package com.sourav.array.problems;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class KthMaxMin {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		System.out.print("Enter Kth position of minimum elements you want in array:");
		int k = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		for (int j = 0; j < n; j++) {
			int loc = selection_sort(arr, j, n);
			int temp = arr[j];
			arr[j] = arr[loc];
			arr[loc] = temp;

			if (j == k-1) {
				System.out.println("Kth Minimum Number ..." + arr[j]);
				break;
			}
		}
	}

	static int selection_sort(int a[], int k, int n) {
		int locIndex = k, min = a[k];
		for (int j = k; j < n; j++) {
			if (min > a[j]) {
				min = a[j];
				locIndex = j;
			}
		}
		return locIndex;
	}
}