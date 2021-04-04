package com.sourav.collections.problems;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CandyDistribution {
	 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			System.out.print("Enter no. of elements you want in array:");
		    int n = input.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}
			int candy = distributeCandies(arr);
			System.out.print("Output:" +candy);
	 }
	 static int distributeCandies(int[] candyType) {

	        LinkedHashSet<Integer> set
	            = new LinkedHashSet<Integer>();
	 
	        // adding elements to LinkedHashSet
	        for (int i = 0; i < candyType.length; i++)
	            set.add(candyType[i]);
	 
	       if (set.size() == (candyType.length/2))
	            return candyType.length/2;
	        else if (set.size() < (candyType.length/2))
	            return set.size();
	      return candyType.length/2;  
	    }
}
