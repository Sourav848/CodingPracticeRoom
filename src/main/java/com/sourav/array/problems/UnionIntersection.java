package com.sourav.array.problems;

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

	static void printIntersection(int a[], int b[], int m, int n) {
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < m; i++)
			hs.add(a[i]);

		for (int i = 0; i < n; i++) {
			if (hs.contains(b[i])) {
				System.out.println(b[i]);
				hs.remove(b[i]); // to remove existing elements to reduce time complexity
			}
		}

	}

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

		System.out.println("Number of elements after union operation: " + doUnion(a, m, b, n)); // union means distinct
																								// element of arr1 and
																								// arr2

		System.out.println("Common elements in both arrays are or Intersection is: "); // intersection means duplicates
																						// number in arr1 and arr2
		printIntersection(a, b, m, n);

	}
}
