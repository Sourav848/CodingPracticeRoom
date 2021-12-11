package com.sourav.array.problems;

import java.util.ArrayList;

public class WindowSliding {

	
	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int start = 0, end=k;
        int max = Integer.MIN_VALUE;
        while (end <= n) {
            
            for (int i=start; i<end; i++)
                max = Math.max(max, arr[i]);
                
            list.add(max);
            max = Integer.MIN_VALUE;
            start++;
            end++;
            
            
        }
        return list;
    }
	
	
	public static void main(String args[]) {

		 int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		 int k = 3;
		
		 ArrayList<Integer> list = max_of_subarrays(arr, arr.length, k);
		 
		 for (Integer ele : list)
			 System.out.print(ele+ " ");
	}
	
	
	/*Explanation: 
		1st contiguous subarray = {1 2 3} Max = 3
		2nd contiguous subarray = {2 3 1} Max = 3
		3rd contiguous subarray = {3 1 4} Max = 4
		4th contiguous subarray = {1 4 5} Max = 5
		5th contiguous subarray = {4 5 2} Max = 5
		6th contiguous subarray = {5 2 3} Max = 5
		7th contiguous subarray = {2 3 6} Max = 6  */
		
}
