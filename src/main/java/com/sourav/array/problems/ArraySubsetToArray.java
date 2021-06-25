package com.sourav.array.problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySubsetToArray {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Define length of first array in number");
		int n = input.nextInt();
		long[] arr1 = new long[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("Define length of second array in number");
		int m = input.nextInt();
		long[] arr2 = new long[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = input.nextInt();
		}
		String rep = isSubset(arr1, arr2, n, m);
		System.out.println("Is a2[] is a subset of a1[]: " +rep);
		// Loop through the array in reverse order
	}
	
	
	
public static String isSubset( long a1[], long a2[], long n, long m) {
        
        Set<Long> set = new HashSet<Long>();
        
        for (int i=0; i<n; i++) 
             set.add(a1[i]);
             
        for (int i=0; i<m; i++) 
             set.add(a2[i]);
        
        
        if (set.size() == n)
          return "Yes";
        
     return "No";   
    }

}
