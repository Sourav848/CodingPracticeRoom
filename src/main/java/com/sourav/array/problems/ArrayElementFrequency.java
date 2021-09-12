package com.sourav.array.problems;

import java.util.HashMap;
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
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 2, 3, 3};
		Map<Integer, Integer> map = elementFrequency(arr);
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		System.out.println(entry);
	}
}