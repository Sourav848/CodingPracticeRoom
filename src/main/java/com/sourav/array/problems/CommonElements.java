package com.sourav.array.problems;

import java.util.*;

public class CommonElements {
	
	static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {

		if (n2 > n1 && n2 > n3) { // here making n1 greater among them.
			int[] temp = A;
			A = B;
			B = temp;

			int temp1 = n1;
			n1 = n2;
			n2 = temp1;
		} else if (n3 > n1 && n3 > n2) {
			int[] temp = A;
			A = C;
			C = temp;

			int temp1 = n1;
			n1 = n3;
			n3 = temp1;
		}

		ArrayList<Integer> al = new ArrayList<Integer>(); //	//Arrays.binarySearch(array,element));
		for (int i = 0; i < n1; i++) {
			if (binarySearch(B, 0, n2 - 1, A[i]) != -1 && binarySearch(C, 0, n3 - 1, A[i]) != -1) {
				if (!al.contains(A[i]))
					al.add(A[i]);
			}
		}
		return al;
	}

	// A recursive binary search function. It returns
	// location of x in given array arr[l..r] is present,
	// otherwise -1
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the middle
			// itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can
			// only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present in
		// array
		return -1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();

			int A[] = new int[n1];
			int B[] = new int[n2];
			int C[] = new int[n3];

			for (int i = 0; i < n1; i++) {
				A[i] = sc.nextInt();
			}
			for (int i = 0; i < n2; i++) {
				B[i] = sc.nextInt();
			}
			for (int i = 0; i < n3; i++) {
				C[i] = sc.nextInt();
			}

			ArrayList<Integer> res = commonElements(A, B, C, n1, n2, n3);
			if (res.size() == 0) {
				System.out.print(-1);
			} else {
				for (int i = 0; i < res.size(); i++) {
					System.out.print(res.get(i) + " ");
				}
			}
			System.out.println();
		}
	}
	
}