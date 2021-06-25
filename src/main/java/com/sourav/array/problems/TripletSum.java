package com.sourav.array.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TripletSum {

	public static boolean findTriplets(int A[], int n, int X) {
		Map<Integer, Integer> values = new HashMap<Integer, Integer>();
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
