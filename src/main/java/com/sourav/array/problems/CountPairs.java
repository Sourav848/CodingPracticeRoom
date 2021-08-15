package com.sourav.array.problems;

import java.util.HashMap;

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
	
    static int getPairsCountTwo(int n, int sum)
    {
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
            // (arr[i], arr[i]) pair is not considered --> {0, 5, 7} = sum = 0;
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
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
