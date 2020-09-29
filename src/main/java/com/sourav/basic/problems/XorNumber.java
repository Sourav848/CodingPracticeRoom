package com.sourav.basic.problems;

import java.util.Scanner;

public class XorNumber {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i>0) {
		System.out.println("Enter the values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a ^ b;
		System.out.println("XOR of a & b is = " + sum);
		i++;
		}
	}

}
