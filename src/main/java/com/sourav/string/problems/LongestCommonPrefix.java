package com.sourav.string.problems;

import java.util.Arrays;

public class LongestCommonPrefix {

	
	//The reason why we sort the input array of strings and compare the first and last strings is that the longest common prefix of all the strings must be a prefix of the first string and a prefix of the last string in the sorted array. This is because strings are ordered based on their alphabetical order (Lexicographical order).
	//For example, consider the input array of strings {"flower", "flow", "flight"}. After sorting the array, we get {"flight", "flow", "flower"}. The longest common prefix of all the strings is "fl", which is located at the beginning of the first string "flight" and the second string "flow". Therefore, by comparing the first and 
	//last strings of the sorted array, we can easily find the longest common prefix.
	
	 public static String longestCommonPrefix(String[] strs) {
	        Arrays.sort(strs);
	        String s1 = strs[0];
	        String s2 = strs[strs.length-1];
	        int idx = 0;
	        while(idx < s1.length() && idx < s2.length()){
	            if(s1.charAt(idx) == s2.charAt(idx)){
	                idx++;
	            } else {
	                break;
	            }
	        }
	        return s1.substring(0, idx);
	    }
	 
	 public static void main(String[] args) {
			String[] strs = {"flower","flow","flight"};
		//	String[] strs = {"apple","ape","zebra"}; // no common prefix
			String lrs = longestCommonPrefix(strs);
			System.out.println("Longest repeating sequence: " + lrs);
		}

}
