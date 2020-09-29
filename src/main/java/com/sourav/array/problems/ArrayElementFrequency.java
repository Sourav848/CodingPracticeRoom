package com.sourav.array.problems;

import java.util.Scanner;

public class ArrayElementFrequency {
	
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		bubblesort(arr);
		
	}
	
  static void bubblesort(int arr[]) {
		
	}


}
