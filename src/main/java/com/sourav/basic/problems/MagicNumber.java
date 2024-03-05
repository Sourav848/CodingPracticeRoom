package com.sourav.basic.problems;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String args[]) {

		int num, rem, temp, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");
		num = sc.nextInt();// 289
		temp = num;
		while (temp > 9) {
			sum = 0;
			while (temp != 0) {
				rem = temp % 10;
				sum = sum + rem;
				temp = temp / 10;
			}
			temp = sum;
		}

		if (sum == 1)
			System.out.println("Number is Magic Number");// 289
		else
			System.out.println("Number is not Magic Number");
	}
}

