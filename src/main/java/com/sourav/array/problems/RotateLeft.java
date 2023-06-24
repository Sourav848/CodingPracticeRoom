package com.sourav.array.problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class RotateLeft {

	static int[] rotLeft(int[] a, int k) {
		int n = a.length;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[(i + (n - k)) % n] = a[i]; // (i+k) % n for right
		}

		return arr;
	}
	
	 static void rotateArrLeft(int arr[], int d, int n)
	    {
	     
	     Queue<Integer> q=new LinkedList<>();

	        for(int i=0;i<n;i++)

	            q.add(arr[i]);

	         for(int i=0;i<d;i++)

	            q.add(q.poll());

	        for(int i=0;i<n;i++)

	           arr[i]=q.poll();
	        
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	 
	    }
	 
	 
	   static void rotateArrRight(int arr[], int d, int n)
       {
        
        Deque<Integer> q=new ArrayDeque<>();

           for(int i=0;i<n;i++)

               q.add(arr[i]);

            for(int i=0;i<d;i++)

               q.offerFirst(q.pollLast());

           for(int i=0;i<n;i++)

              arr[i]=q.pop();
           
           for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + "wo   ");
           }

    
       }
	 
	

	public static void main(String[] args) {
		// Initialize array
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// n determine the number of times an array should be rotated
		int n = 3;
		int n1 = 2;

		rotLeft(arr1, n1);
		
		rotateArrLeft(arr1, n1, arr1.length);
		
		rotateArrRight(arr, n1, arr.length);
		
		// Displays original array
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Rotate the given array by n times toward left
		for (int i = 0; i < n; i++) {
			int j, first;
			// Stores the first element of the array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// Shift element of array by one
				arr[j] = arr[j + 1];
			}
			// First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		// Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}