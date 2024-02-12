package com.sourav.array.problems;

import java.util.HashMap;

/* Java implementation of simple method to find count of
pairs with given sum*/

// Technique : Hashing

class CountPairs {
	
	static int getPairsCount(int arr[], int n, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		// Store counts of all elements in map hm
		for (int i = 0; i < n; i++) {

			// initializing value to 0, if key not found
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 1);
			else
				hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		int twice_count = 0;

		// iterate through each element and increment the
		// count (Notice that every pair is counted twice)
		for (int i = 0; i < n; i++) {
			if (hm.get(sum - arr[i]) != null)
				twice_count += hm.get(sum - arr[i]);

			// if (arr[i], arr[i]) pair satisfies the
			// condition, then we need to ensure that the
			// count is decreased by one such that the
			// (arr[i], arr[i]) pair is not considered --> {0, 5, 7} = 
			                                           //   sum = 0;
			if (sum - arr[i] == arr[i])
				twice_count--;
		}

		// return the half of twice_count
		return twice_count / 2;
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		int arr[] = { 2, 2, 4, 0, 0 };
		int sum = 6;
		System.out.println("Count of pairs is " + getPairsCount(arr, arr.length, sum));
	}
}
