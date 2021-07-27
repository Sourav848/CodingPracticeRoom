package com.sourav.array.problems;

public class MaximumProductSubarray {

	
	
	static long maxProduct(int[] nums, int n) {
	        long prod = Integer.MIN_VALUE, cur = 1;
	        for(int i=0;i<n;i++) {
	            if(nums[i] == 0){
	                cur = 1;
	                prod = Math.max(prod, nums[i]);
	            }
	            else{
	                cur *= nums[i];
	                prod = Math.max(prod, cur);
	            }
	        }
	        cur = 1;
	        for(int i=n-1;i>=0;i--){
	            if(nums[i] == 0){
	                cur = 1;
	                prod = Math.max(prod, nums[i]);
	            }
	            else{
	                cur *= nums[i];
	                prod = Math.max(prod, cur);
	            }
	        }
	        return prod;
	    }
	
	public static void main(String[] args) {

		      int arr[] = {6, -3, -10, 0, 2};// Test case for first Loop
		 //   int arr[] = {-2, 3, 4, 5, 1}; // Test case for second Loop

		System.out.println(maxProduct(arr, arr.length));
	}
}
