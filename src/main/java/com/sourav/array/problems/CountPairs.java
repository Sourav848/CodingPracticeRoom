package com.sourav.array.problems;

/* Java implementation of simple method to find count of
pairs with given sum*/


class CountPairs {
	static int arr[] = { 2,2,4,0,0 };

	// Iterating loop where in each iteration keep left constant and traversing from R-L
	// checking sum is equals or not, if it is making count
	// decrementing right after condition get flase again incrementing left by 1 and reassigning right to n-1.
	//keep iterating until left will traverse to n and all possible pair of array got checked.
	static int getPairsCount(int n, int sum)
	{
		int left = 0;
		int right = n - 1;
		int count = 0;
		while (left < n && right >= 0) {
			if (left != right) {
				if ((arr[left] + arr[right]) == sum) {
					count++;
				}
				right--;
			} else {
				right = n - 1;
				left++;
			}
		}
		return count;
	}
	

	// Driver method to test the above function
	public static void main(String[] args)
	{

		int sum = 6;
		System.out.println(
			"Count of pairs is "
			+ getPairsCount(arr.length, sum));
	}
}
// This code is contributed by Gaurav Miglani
