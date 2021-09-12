package com.sourav.array.problems;

class RotateLeft {

	static int[] rotLeft(int[] a, int k) {
		int n = a.length;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[(i + (n - k)) % n] = a[i];
		}

		return arr;
	}

	public static void main(String[] args) {
		// Initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// n determine the number of times an array should be rotated
		int n = 3;
		int n1 = 2;

		rotLeft(arr1, n1);
		// Displays original array
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Rotate the given array by n times toward left
		for (int i = 0; i < n; i++) {
			int j, first;
			// Stores the first element of the array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// Shift element of array by one
				arr[j] = arr[j + 1];
			}
			// First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		// Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}