package com.sourav.array.problems;


//companies : optum

public class EquilibriumPoint {

	public static int equilibriumPoint(long arr[], int n) {

		int rightsum = 0; // initialize rightsum of whole array
		int leftsum = 0; // initialize leftsum

		/* Find rightsum of the whole array */
		for (int i = 0; i < n; i++)
			rightsum += arr[i];

		for (int i = 0; i < n; i++) {
			rightsum -= arr[i]; // rightsum is now right rightsum for index i

			if (leftsum == rightsum)
				return i;

			leftsum += arr[i];
		}

		/* If no equilibrium index found, then return 0 */
		return -1;
	}

	public static void main(String[] args) {

		//long[] arr = { 1, 2, 3, 4, 5 };
		long arr[] = {1,3,5,2,2};

		System.out.println(equilibriumPoint(arr, arr.length));
	}

}
