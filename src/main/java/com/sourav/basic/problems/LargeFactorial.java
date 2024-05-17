package com.sourav.basic.problems;


import java.math.BigInteger;
import java.util.ArrayList;

public class LargeFactorial {
	
	
	
		static ArrayList<Integer> bigfactorial(int N){
        //code here
        ArrayList<Integer> ob = new ArrayList<>();
       
        BigInteger f = new BigInteger("1");
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
        
       String fact = f.toString();
       for(int i=0;i<fact.length();i++)
       {
           char ch = fact.charAt(i);
           int digit = Integer.parseInt(String.valueOf(ch));
           ob.add(digit);
       }
       return ob;
    }
		
		public static void main(String[] args) {
			
			ArrayList<Integer> list = bigfactorial(5);//25
			System.out.println(list);
			
		}
}
