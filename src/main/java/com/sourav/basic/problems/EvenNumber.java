package com.sourav.basic.problems;

import java.util.Scanner;

public class EvenNumber {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = 1;
		while (i>0) {
		int a = sc.nextInt();
		if (a%2 == 0)
			System.out.println(a+" is even number.");
		else
			System.out.println(a+" is not even number.");
		i++;
		}
	}
	
}
