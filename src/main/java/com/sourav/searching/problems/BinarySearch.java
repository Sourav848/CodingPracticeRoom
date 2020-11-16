package com.sourav.searching.problems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Enter no. of elements you want to search in array:");
		int searchedItem = input.nextInt();
		Arrays.sort(arr); // Array must be sorted for binary search algo
		binary_search(arr, n, searchedItem);
	}

	static void binary_search(int a[], int size, int item) {
		int left = 0, mid = 0, right = size - 1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (item == a[mid]) {
				System.out.println("Search is successful item is found at " + (mid + 1) + " position in array");
			    return; }
				else if (item > a[mid])
				left = mid + 1;
			else
				right = mid - 1;
		}
	}

}
