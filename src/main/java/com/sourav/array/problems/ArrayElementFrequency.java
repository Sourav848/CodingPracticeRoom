package com.sourav.array.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayElementFrequency {

	
	public static Map<Integer, Integer> elementFrequency(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else 
				map.put(nums[i], map.get(nums[i]) +  1);
		}
	return map;
	
	}
	
	
public static Map<Character, Integer> elementStringFrequency(String str) { 
	Map<Character, Integer> values = new LinkedHashMap<Character, Integer>();
	for (int i = 0; i < str.length(); i++) {
	    if (!values.containsKey(str.charAt(i)))
		 values.put(str.charAt(i), 1);
		else 
	     values.put(str.charAt(i), values.get(str.charAt(i)) + 1);	
	}
	
	return values;
}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 2, 3, 3};
		Map<Integer, Integer> map = elementFrequency(arr);
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		System.out.println(entry);
		
		
		String str = "MISS";
		Map<Character, Integer> values = elementStringFrequency(str);
		
		for (Map.Entry<Character, Integer> entry : values.entrySet())
		System.out.println(entry);
	}
}