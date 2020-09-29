package com.sourav.basic.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int start = s.nextInt();
		int end = s.nextInt();
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
		/* System.out.print(Math.sqrt(n)); */
		for (int number = start; number < end; number++) {
			if (isPrime(number)) {
				primeNumberList.add(number);
			} else {
				/* System.out.println(number + " is not a prime number"); */
			}
		} System.out.println(primeNumberList);
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}