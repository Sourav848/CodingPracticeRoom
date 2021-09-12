package com.sourav.basic.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class rough {

	static int count = 10;

	static int i = 1;

	
	static int atoi(String str) { // Your code here
		char[] C = str.toCharArray();
		for (int i = 0; i < C.length; i++) {

			if (!Character.isDigit(C[i]) && !str.contains("_"))
				return -1;
		}

		return Integer.parseInt(str);
	}
	 

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		
		/*
		 * for (Integer ele : list) if (list.contains(ele)) list.remove(ele);
		 */
		
		System.out.println(list);
		
		List<Integer> list1 =   list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list1);
	}

}
