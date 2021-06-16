package com.sourav.array.problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
	
	//Technique 1
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
	
	 public static void findDuplicate(int[] nums) {	        
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
            	System.out.println("Duplicate element is: "+num);  
            }
            seen.add(num);
        }
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
        findDuplicate(arr);
    }  

}
