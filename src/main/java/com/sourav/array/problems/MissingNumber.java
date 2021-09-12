package com.sourav.array.problems;

public class MissingNumber {
	
	
	//edge case : if a[] doesn't consist 0.
	static int missingNumber(int a[], int n) {
        
		int n_elements_sum = n * (n + 1) / 2;
	    int sum = 0;
	 
	    for(int i = 0; i < n - 1; i++)
	        sum += a[i];
	         
	    return n_elements_sum - sum;
    }
	
	public static int getMissingNumberUnsortedArray(int arr[])
    {
        int i, total;
        int n = arr.length;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= arr[i];
        return total;
    }
	

	
	
	public static void main(String[] args)
    {
        //int[] a = {1, 2, 4, 5};
         int[] a = {1,2,3,4,5,6,7,8,10};
        System.out.println("Missing Number is: " +missingNumber(a, a.length));
        
        
        int[] number = {6, 3, 2, 4, 1};
        System.out.println("Missing Number is:" + getMissingNumberUnsortedArray(number));
    }

}
