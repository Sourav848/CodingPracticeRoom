package com.sourav.array.problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayZeroSum {
    static boolean findsum(int arr[],int n)
    {
        Set< Integer > set = new HashSet<>();
        int sum = 0;
        for (int a : arr) {
            sum += a;
            if (set.contains(sum) || a == 0 || sum == 0)
            	return true;
            set.add(sum);
        }
        return false;
    }
	
	
    public static void main(String[] args) throws java.lang.Exception {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = input.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {	
			a[i] = input.nextInt();
		}

		if (findsum(a, n)) 
			System.out.println("Array contains subarray sum is zero");
		else 
			System.out.println("Array does not contains subarray sum is zero");
	}

}