package com.sourav.array.problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
	
	//Technique 1 TC = 0(n) // SC = 0(1)
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
		
	//Technique 2
	public static void removeDuplicate_linkedhashset(int arr[], int n) {
		Set<Integer> hashset = new LinkedHashSet<Integer>();
		for (int i = 0; i < n; i++) {
			hashset.add(arr[i]);
		}
		
		System.out.println("Only Unique elements through hashet ");  
		for (Integer i : hashset) {
			System.out.println(i+" ");  
		}
	}
	
	private static void removeDuplicates(int[] array) {
        int n = array.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            int index = Math.abs(array[i]) % n;

            // Mark the element at the calculated index as negative
            if (array[index] > 0) {
                array[index] = -array[index];
            }
        }

        // Reset the array with non-negative elements
        for (int i = 0; i < n; i++) {
            array[i] = Math.abs(array[i]);
        }
        
        for (int i=0; i<array.length; i++)  
            System.out.print(array[i]+" ");
    }
	
	
	
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50}; //always worked on sorted array
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.println(arr[i]+" ");  
        removeDuplicate_linkedhashset(arr, length);
        //To find duplicate elements
        removeDuplicates(arr);
    }  

}
