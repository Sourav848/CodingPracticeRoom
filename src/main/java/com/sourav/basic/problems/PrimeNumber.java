package com.sourav.basic.problems;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int j = 1;
	while (j>0) {
    System.out.println("Enter a number");
	int a = sc.nextInt();
	int count = 0;
	for (int i=2; i<=a; i++) {
	if (a%i == 0) 
		count++;
	}
	if (count == 1)
	  System.out.println("This is a prime number");
	else
		System.out.println("This is not a prime number");
  } j++;
	}
}
