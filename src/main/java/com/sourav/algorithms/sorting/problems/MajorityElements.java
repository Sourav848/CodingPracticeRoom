package com.sourav.algorithms.sorting.problems;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//link : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#

public class MajorityElements {
	
    static int majorityElement(int a[], int n)
    {
       Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
       int max = Integer.MIN_VALUE;
       int key = 0;
       
       for (int i=0; i<n; i++) {
            if (!map.containsKey(a[i]))
              map.put(a[i], 1);
             else 
               map.put(a[i], map.get(a[i]) + 1);
        }
        
         if (map.size() == 1)
           return a[key];
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            
          //  max = Math.max(max, entry.getValue());
            if (entry.getValue() > max) {
             key = entry.getKey();
             max = entry.getValue();
            }
        }
        
        if (max == 1 || max <= n/2)
         return -1;
    return key;
        
    }
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(majorityElement(arr, n));
	}
}
