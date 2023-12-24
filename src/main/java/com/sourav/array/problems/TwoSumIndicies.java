package com.sourav.array.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Return indices of the two numbers such that they add up to a specific target

public class TwoSumIndicies {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Define length of array in number");
		int n = input.nextInt();
		int target = input.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[2];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		arr1 = twoSum(arr, target);
		System.out.println("Two indicies are: ");
		// Loop through the array in reverse order
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			values.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int val = target - nums[i];
			Integer secondIndex = values.get(val);
			if (secondIndex != null && secondIndex != i) {
				answer[0] = i;
				answer[1] = secondIndex;
				return answer;
			}
		}
		return answer;
	}
}

//https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
