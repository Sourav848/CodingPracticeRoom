package com.sourav.array.problems;

import java.util.HashMap;

//Number of subarrays having sum exactly equal to k.

public class SubarraySumNumber {

	// Technique : Prefix sum

	static int findSubarraySum(int arr[], int n, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int res = 0;
		int prefixsum = 0;

		for (int i = 0; i < n; i++) {
			prefixsum += arr[i];
			if (prefixsum == sum)
				res++;
			if (map.containsKey(prefixsum - sum))
				res += map.get(prefixsum - sum);
			Integer count = map.get(prefixsum);
			if (count == null)
				map.put(prefixsum, 1);
			else
				map.put(prefixsum, count + 1);
		}
		return res;
	}

	public static void main(String[] args) {

		//int arr[] = { 10, 2, -2, -20, 10 };
		//int sum = 10;

	    int arr[] = { 3, 3, 5, 12, -6 };
		int sum = 6;
		int n = arr.length;
		System.out.println(findSubarraySum(arr, n, sum));
	}
}
