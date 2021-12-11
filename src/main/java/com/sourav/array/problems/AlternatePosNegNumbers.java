package com.sourav.array.problems;

import java.util.ArrayList;
import java.util.Scanner;

//companies : DXC, EPAM

public class AlternatePosNegNumbers {
	static void rearrange(int arr[], int n) {
		ArrayList<Integer> neg = new ArrayList<Integer>();
		ArrayList<Integer> pos = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {

			if (arr[i] < 0)
				neg.add(arr[i]);
			else
				pos.add(arr[i]);
		}

		int i = 0, j = 0, k = 0;
		while (j < pos.size() && i < neg.size()) {
			arr[k] = pos.get(j);
			k++;
			j++;
			arr[k] = neg.get(i);
			k++;
			i++;
		}
		while (j < pos.size()) {
			arr[k] = pos.get(j);
			k++;
			j++;
		}

		while (i < neg.size()) {
			arr[k] = neg.get(i);
			k++;
			i++;
		}

		// printing
		System.out.println("Alternate Positive and negative numbers are");
		for (int l = 0; l < n; l++) {
			System.out.print(arr[l] + " ");
		}

	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}

		rearrange(a, n);

	}

}
