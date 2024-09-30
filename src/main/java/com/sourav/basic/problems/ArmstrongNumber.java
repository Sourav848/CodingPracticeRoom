package com.sourav.basic.problems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]) {
//Akanksha Practice
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = 1;
		while (i > 0) {
			int num = sc.nextInt();
			int temp = num;
			int armstrongNumber = 0;
			while (temp > 0) {
				int modValue = temp % 10;
				temp = temp / 10;
				armstrongNumber = armstrongNumber + modValue*modValue*modValue;
			}
			if (armstrongNumber == num)
				System.out.println("armstrong number"); //153 is armstrong number
			else
				System.out.println("Not armstrong number"); 
			i++;
		}
	}
}
