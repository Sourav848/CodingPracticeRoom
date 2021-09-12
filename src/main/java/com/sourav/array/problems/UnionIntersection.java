package com.sourav.array.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
//If there are repetitions, then only one occurrence of element should be printed in union.
public class UnionIntersection {

	public static int doUnion(int a[], int n, int b[], int m) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n + m; i++) {
			if (i < n)
				set.add(a[i]);
			if (i < m)
				set.add(b[i]);
		}
		return set.size();
	}

	static void printIntersection(int arr1[], int arr2[], int m, int n) {
// Before finding intersection, make sure
// arr1[0..m-1] is smaller---> a1 is smaller so that we can pass in binary search with search number to find common number.
		if (m > n) {
			int tempp[] = arr1;
			arr1 = arr2;
			arr2 = tempp;

			int temp = m;
			m = n;
			n = temp;
		}

// Now arr1[] is smaller
// Sort smaller array arr1[0..m-1]
		Arrays.sort(arr1);

// Search every element of bigger array in smaller
// array and print the element if found
		for (int i = 0; i < n; i++) {
			if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1)
				System.out.print(arr2[i] + " ");
		}
	}

// A recursive binary search function. It returns
// location of x in given array arr[l..r] is present,
// otherwise -1
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	/*
	 * static void intersection() {
	 * 
	 * Integer[] firstArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
	 * Integer[] secondArray = { 1, 3, 5, 7, 9 };
	 * 
	 * HashSet<Integer> set = new HashSet<>();
	 * 
	 * set.addAll(Arrays.asList(firstArray));
	 * 
	 * set.retainAll(Arrays.asList(secondArray));
	 * 
	 * // convert to array 
	 * Integer[] intersection = {}; 
	 * intersection =  set.toArray(intersection);
	 * 
	 * System.out.println("Common elements in both arrays are: "
	 * +Arrays.toString(intersection)); }
	 */

	public static void main(String[] args) throws java.lang.Exception {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in first array:");
		int m = input.nextInt();
		int a[] = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = input.nextInt();
		}

		System.out.print("Enter no. of elements you want in second array:");
		int n = input.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = input.nextInt();
		}

		System.out.println("Number of elements after union operation: " + doUnion(a, m, b, n)); //union means distinct element of arr1 and arr2

		System.out.println("Common elements in both arrays are or Intersection is: "); // intersection means duplicates number in arr1 and arr2
		printIntersection(a, b, m, n);

	}
}
