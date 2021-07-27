package com.sourav.basic.problems;


public class rough {
	
	
	static void findSubarraySum(int n) {
		
		System.out.println(n);
		if (n>=100)
			return ;
		findSubarraySum(n+1);
		
	}

	public static void main(String[] args) {
		
		findSubarraySum(1);
	}
}