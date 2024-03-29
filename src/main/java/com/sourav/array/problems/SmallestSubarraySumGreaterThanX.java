package com.sourav.array.problems;


public class SmallestSubarraySumGreaterThanX {
	
	//Technique : Two Pointer 
	
	static int smallestSubWithSum(int arr[], int n, int x)
    {
        // Initialize current sum and minimum length
        int curr_sum = 0, min_len = n + 1;
 
        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];
 
            // If current sum becomes greater than x.
            while (curr_sum >= x && start < n) {
            	
                // Update minimum length if needed
                min_len = Math.min(min_len, end - start);
 
                // remove starting elements
                curr_sum -= arr[start++];
            }
        }
        return min_len+1;
    }
	
	public static void main(String[] args) {

		int arr[] = {1, 4, 45, 6, 0, 19};
		int x  =  51;
		//int arr[] = {6, 3, 4, 5, 4, 3, 7, 9};
		//int x  =  16;
	//	int[] arr = {2,3,1,1,1,1,1};
	//	int x=5;
		int n = arr.length;
		System.out.println(smallestSubWithSum(arr, n, x));
	}

}
