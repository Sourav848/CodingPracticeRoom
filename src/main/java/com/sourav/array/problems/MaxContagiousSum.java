package com.sourav.array.problems;

//Java program to print largest contiguous array sum

//companies : BigBasket

class MaxContagiousSum // Kadane Algorithim
{
	public static void main(String[] args) {
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		//int a[] = {-5, 1, 2, -3, 4 };
		System.out.println("Maximum contiguous sum is " + maxSubarraySum(a, a.length));
	}

	static int maxSubarraySum(int arr[], int n) {
		int max_so_far = 0;
		int min_so_far = 0;
		for (int i = 0; i < n; i++) {
			min_so_far = min_so_far + arr[i];
			if (min_so_far > max_so_far)
				max_so_far = min_so_far;
			if (min_so_far < 0)
				min_so_far = 0;
		}
		return max_so_far;

	}
}
