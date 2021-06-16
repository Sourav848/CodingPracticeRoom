package com.sourav.basic.problems;

import java.util.Arrays;

class rough {
	
	 public static void merge(long arr1[], long arr2[], int n, int m) 
	{
		// code here
		long[] arr3 = new long[n + m];
		int j = 0;
		for (int i = 0; i < m + n; i++) {
			if (i < n)
				arr3[i] = arr1[i];
			else {
				arr3[i] = arr2[j];
				j++;
			}
		}
		Arrays.sort(arr3);
		j = 0;
		for (int i = 0; i < m + n; i++) {
			if (i < n)
				arr1[i] = arr3[i];
			else {
				arr2[j] = arr3[i];
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i]);
		}
		for (int i = 0; i < m; i++) {
			System.out.print(arr2[i]);
		}
	}
	
	
	
    public static void main(String args[] ) throws Exception {
    	
     long arr1[] = {1, 3, 5, 7}; 
     long arr2[] = {0, 2, 6, 8, 9};
     
     merge(arr1, arr2, arr1.length, arr2.length);
    	
    }

}