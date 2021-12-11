package com.sourav.array.problems;

import java.util.HashMap;

public class LargestSubarraySumZero {
	
	//Technique : Prefix Sum Array
	
	static int maxLen(int arr[], int n)
    {
        int maxlen = 0;
        int prefixSum = 0;
        int i = -1;
        HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
        map.put(prefixSum, i);
        
        while (i<n-1) {
          i++;
          prefixSum += arr[i];
         if (!map.containsKey(prefixSum)){
             map.put(prefixSum, i);
         } else {
             int len = i - map.get(prefixSum);
             if (len > maxlen)
              maxlen = len;
          }
        }
        return maxlen;
    }
	
	
	public static void main(String[] args) {

		int arr[] = {15,-2,2,-8,1,7,10,23};
		int n = arr.length;
		System.out.println(maxLen(arr, n));
	}

}
