package com.sourav.array.problems;

import java.util.HashMap;


//Number of subarrays having sum exactly equal to k.

public class SubarraySumNumber {

	//Technique : Prefix sum
	
	static int findSubarraySum(int arr[], int n, int sum) {
		HashMap<Integer, Integer> prevSum = new HashMap<>();

		int res = 0;

		int currsum = 0;

		for (int i = 0; i < n; i++) {

			currsum += arr[i];

			if (currsum == sum)
				res++;

			if (prevSum.containsKey(currsum - sum))
				res += prevSum.get(currsum - sum);

			Integer count = prevSum.get(currsum);
			if (count == null)
				prevSum.put(currsum, 1);
			else
				prevSum.put(currsum, count + 1);
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

