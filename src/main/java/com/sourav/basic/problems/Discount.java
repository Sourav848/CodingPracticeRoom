package com.sourav.basic.problems;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int markedPrice = sc.nextInt();
		float discountInPercentage = sc.nextFloat();

		System.out.print(
				"The selling price after discount is " + calculateSellingPrice(markedPrice, discountInPercentage));
	}

	static float calculateSellingPrice(int markedPrice, float discountInPercentage) {
		float discount = markedPrice * discountInPercentage / 100;
		float sellingPrice = markedPrice - discount;

		return sellingPrice;
	}

}
