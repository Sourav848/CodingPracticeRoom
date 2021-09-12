package com.sourav.array.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurences {
	
	static public int countOccurence(int[] arr, int n, int k) 
    {
        int t = n/k;
        int count = 0;
        
		//int[] answer = new int[2];
		Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
		    if (!values.containsKey(arr[i]))
			 values.put(arr[i], 1);
			else 
		     values.put(arr[i], values.get(arr[i]) + 1);	
		}
		
		for (Map.Entry<Integer, Integer> entry :  values.entrySet()) {
		     if (entry.getValue() > t)
		         count ++;
		}
		return count;
	
    }
	
	public static void main(String[] arg) { 
		
		int N = 8;
		int arr[] = {3,1,2,2,1,2,3,3};
		int K = 4;
		
		//int N = 6;
		//int arr[] = {1, 2, 2, 2, 3, 3};
		//int K = 3;
		
		System.out.println("There are "+countOccurence(arr, N, K)+ " numbers which occurs more than "+N/K+ " times.");
		

        String str = "MISS";
        
		Map<Character, Integer> values = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
		    if (!values.containsKey(str.charAt(i)))
			 values.put(str.charAt(i), 1);
			else 
		     values.put(str.charAt(i), values.get(str.charAt(i)) + 1);	
		}
		
		System.out.println(values);
	}

}
