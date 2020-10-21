package com.sourav.basic.problems;

import java.util.Scanner;

public class FactorialNumber {
	
	/*
	 * static int factorial(int n) {
	 * if (n >= 1)
	 * return n * factorial(n-1);
	 * else
	 * return 1; }
	 */
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = 1;
		while (i > 0) {		
			 int j,fact=1;  
			  int number=5;//It is the number to calculate factorial 
			/* fact = factorial(number); */
			  for(j=1;j<=number;j++){ fact=fact*j; }
			  System.out.println("Factorial of "+number+" is: "+fact);  
			  i++;
		}
	}

}
