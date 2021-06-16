package com.sourav.array.problems;

import java.util.Arrays;

public class MergeTwoSortedArray {

	static int[] MergeSortTwo(int arr1[], int arr2[], int l, int m) {

		int arr3[] = new int[l + m];
		int count = 0;
		for (int i = 0; i < l; i++)
			arr3[count++] = arr1[i];
		for (int j = 0; j < m; j++)
			arr3[count++] = arr2[j];

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				if (arr3[j] > arr3[i]) {
					int temp = arr3[j];
					arr3[j] = arr3[i];
					arr3[i] = temp;
				}
			}
		}
		return arr3;
	}
 
    public static void main(String args[]) {
        int arr[] = {10, 54, 63, 6, 420};
        int arr1[] = {-2, 1, 5, 98, -10};
        
       int arr3[] = MergeSortTwo(arr, arr1, arr.length, arr1.length);
       System.out.println("");
        for(int i=0; i<arr3.length; i++)
            System.out.print(arr3[i]+" ");
    }
    
    //Merge Without Extra Space
	public void merge(int arr1[], int arr2[], int n, int m) {

		int[] arr3 = new int[n + m];
		int count = 0;
		int j = 0;
		for (int i = 0; i < n; i++)
			arr3[count++] = arr1[i];
		for (j = 0; j < m; j++)
			arr3[count++] = arr2[j];

		Arrays.sort(arr3);

		j = 0;
		for (int i = 0; i < n + m; i++)
			if (i < n)
				arr1[i] = arr3[i];
			else
				arr2[j++] = arr3[i];

	}
}
