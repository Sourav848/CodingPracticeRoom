package com.sourav.algorithms.sorting.problems;

import java.util.Scanner;

public class BubbleSort {

	static void bubbleSort(int a[], int n) {
	    boolean swapped;
		for (int i = 0; i < n; i++) {
		    swapped = false;
			for (int j = 0; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					swapped = true;
				}
				
				// If no two elements were
	            // swapped by inner loop, then break
	            if (swapped == false)
	                break;
			}
			
        }
		
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);
		}
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
		bubbleSort(arr, n);
	}

}
