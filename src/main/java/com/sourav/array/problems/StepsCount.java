package com.sourav.array.problems;

public class StepsCount {

	
	
	// Fibonacci
	static int countWays(int n)
    {
        
        int a = 0, b=1, c=0;
        if (n==1 || n==0) return 1;
        
        for (int i=0;i<n;i++) {
            c = (a+b)%1000000007;   //to handle, Otherwise it becomes overflow. try with n = 84
            a = b;
            b = c;
        }
        
        return c;
    }
	
	
	public static void main(String[] args) {
		
		int n = 84;
		System.out.println("Number of ways = " +countWays(n));
		
		//Input: n = 4
		//Output: 5
		//(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2) 
		
	}
	
	
}
