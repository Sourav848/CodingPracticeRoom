package com.sourav.array.problems;

public class MissingNumber {
	
	static int missingNumber(int a[], int n) {
        // Your Code Here
        
        int missingNumber = 0;
		for (int i = 0; i <n-1; i++) {
          int front = a[i] + 1;
          int rear = a[i+1];
         if (front != rear)
		{
			missingNumber = front;
            break;
		} }
		return missingNumber;
    }
	
	
	public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,10};
        System.out.println(missingNumber(a, a.length));
    }

}
