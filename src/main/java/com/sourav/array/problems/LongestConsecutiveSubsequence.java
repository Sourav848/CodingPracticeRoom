package com.sourav.array.problems;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LongestConsecutiveSubsequence {

	
	
	
	static int findLongestConseqSubseq(int arr[], int N)
	{
	  
	    LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	    for (Integer i : arr)
	      set.add(i);
	     
	    int[] disarr = new int[set.size()];
	    int i = 0;
	    for (Integer x : set)
	     disarr[i++] = x; 
	     
	   Arrays.sort(disarr);
	   N = disarr.length;
	   
	   int count = 1, longestNum = 1;
	   
	     for (i=0; i<N-1; i++) {
	      if (1+disarr[i] == disarr[i+1]) {
	          count++;
	       longestNum =  Math.max(count, longestNum); }
	      else {
	          count = 1;
	      }
	   } 
	        
	        return longestNum;
	}
	
	
	
	public static void main(String[] args) {

	      int arr[] = {1, 2, 3, 9, 5, 5, 11, 12, 13, 14, 45, 65, 77, 78};// Test case for first Loop
	 //   int arr[] = {-2, 3, 4, 5, 1}; // Test case for second Loop

	System.out.println(findLongestConseqSubseq(arr, arr.length));
	
	
	    /*Input:
		N = 7
		a[] = {2,6,1,9,4,5,3}
		Output:
		6
		Explanation:
		The consecutive numbers here
		are 1, 2, 3, 4, 5, 6. These 6 
		numbers form the longest consecutive
		subsquence.*/
}
}
