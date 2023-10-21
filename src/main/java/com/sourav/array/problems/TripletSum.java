package com.sourav.array.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TripletSum {

	public static boolean findTriplets(int A[], int n, int X) {
		Map<Integer, Integer> values = new HashMap<>();
		for (int i = 0; i < n; i++) {
			values.put(A[i], i);
		}

		int left = 0;
		int right = n - 1;
		while (left < n && right >= 0) {
			if (left != right) {
				int val = X - (A[left] + A[right]);
				Integer ThirdIndex = values.get(val);
				if (ThirdIndex != null && ThirdIndex != left && ThirdIndex != right) {
					return true;
				}
				right--;
			} else {
				right = n - 1;
				left++;
			}
		}
		return false;
	}
	
	   static int findSubarraySum(int arr[], int n, int sum) {
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	        int res = 0;
	        int prefixsum = 0;
	        int minLength = 0;

	        for (int i = 0; i < n; i++) {
	            prefixsum += arr[i];
	            if (prefixsum == sum)
	                minLength = Math.max(minLength, i);
	            if (map.containsKey(prefixsum - sum))
	                minLength = Math.max(minLength, i);
	            Integer count = map.get(prefixsum);
	            if (count == null)
	                map.put(prefixsum, 1);
	            else
	                map.put(prefixsum, count + 1);
	        }
	        return res;
	    }

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Define length of array in number");
		int n = input.nextInt();
		int target = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		Boolean isFound = findTriplets(arr, n, target);
		if (isFound)
			System.out.println("Triplets are found");
		else
			System.out.println("No Triplets");

	}

}
