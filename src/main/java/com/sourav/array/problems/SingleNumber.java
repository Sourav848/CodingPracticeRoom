package com.sourav.array.problems;

public class SingleNumber {

	
	
	public static int singleNumber(int[] nums) {
	    int a = 0;
	    for (int i : nums) {
	      a ^= i; //two identical number will be zero
	    }
	    return a;
	  }
	
	
	public static void main(String[] args)
    {
       int[] a = {8, 8, 7, 7, 6, 1, 6, 6};
      //int[] a = {1, 1, 2, 2, 2};
        System.out.println("Missing Number is: " +singleNumber(a));
    }
}
  