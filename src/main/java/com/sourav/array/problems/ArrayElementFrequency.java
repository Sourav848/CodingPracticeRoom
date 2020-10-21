package com.sourav.array.problems;

import java.util.Scanner;

public class ArrayElementFrequency {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int count = 1;
		int inc = 0;
		int inc1 = 0;
		int n = input.nextInt();
		int[] arr = new int[n];
		/* String strArray[] = new String[3]; */
		int[] frr = new int[n];
		int[] prr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		 bubblesort(arr, n);
		/* Arrays.sort(arr); */
		for (int i = 0; i < arr.length-1; i++) {
		if (arr[i] == arr[i+1]) 
			count++;
		else {
		   frr[inc++] = count;
		   prr[inc1++] = arr[i];
		   count = 1;
		  }
		}
		   frr[inc++] = count;
		   prr[inc1++] = arr[n-1];
		   count = 1;
		for (int i = 0; i < frr.length; i++) {
			if (frr[i] != 0) 
			 System.out.println(prr[i]+"   |    "+frr[i]);
		}
		
	}

	static void bubblesort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
