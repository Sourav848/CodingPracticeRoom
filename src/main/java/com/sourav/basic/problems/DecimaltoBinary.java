package com.sourav.basic.problems;

//Java program to convert a decimal
//number(natural number) to binary number

public class DecimaltoBinary {

	// function to convert decimal to binary
	static void decToBinary(int n) {
		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (n > 0) {
			// storing remainder in binary array
			binaryNum[i++] = n % 2;
			n = n / 2;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(binaryNum[j]);
	
	}
	


	// driver program
	public static void main(String[] args) {
		int n = 8;
		decToBinary(n);
	}
}