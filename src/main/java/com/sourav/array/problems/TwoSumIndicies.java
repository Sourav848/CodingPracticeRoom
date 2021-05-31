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


/*static boolean hasArrayTwoCandidates(
        int A[],
        int arr_size, int sum)
    {
        int l, r;
 
        //sorting array
        Arrays.sort(A);
 
 /// binary search approach for check candidates.
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            else if (A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
        return false;
    }*/

/*
 * You can use a hashmap to store the first array in the following manner:
 * 
 * key value(index in array) 2 - 0 7 - 1 11 - 2 15 - 3 Next get the target
 * element which is 9, and start traversing your given array from index 0.
 * 
 * Element at index 0 is 2 --> calculate (9-2) = 7 --> check if 7 is a key in
 * the hashmap
 * 
 * Additional Note: You need to take care of the following case:
 * 
 * arr = [3, 2, 1, 1] target = 6 (no answer exists in this case, but by the
 * above method, when you calculate 6-3 = 3 you get index 0 as the answer.)
 * 
 * But this can easily be taken care of by checking whether (target-arr[i] ==
 * arr[i]) returns true or not. If it returns true and if the hashmap has two
 * indices stored at the key arr[i], then return it as an answer, else proceed
 * to the next element.
 */