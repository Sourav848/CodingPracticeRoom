package com.sourav.array.problems;

public class MissingNumber {
	
	
	public static int getMissingNumberUnsortedArray(int[] arr, int n) {
		
        int n_elements_sum = (n + 1) * (n + 2) / 2;
        int sum = 0;
        
        for (int i = 0; i < n; i++)
             sum  += arr[i];
        return n_elements_sum - sum;
	}
	

	
	
	public static void main(String[] args)
    {  
        int[] number = {6, 3, 2, 4, 1, 5, 8};
        System.out.println("Missing Number is:" + getMissingNumberUnsortedArray(number, number.length));
    }

}
