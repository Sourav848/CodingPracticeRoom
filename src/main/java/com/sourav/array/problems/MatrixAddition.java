package com.sourav.array.problems;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String args[]) {
//creating two matrices    
		//int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		//int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
		
		Scanner input = new Scanner(System.in);
		System.out.println("Define length of array in number");
		int i = input.nextInt();
		int j = input.nextInt();

		int[][] a = new int[i][j];
		int[][] b = new int[i][j];
//creating another matrix to store the sum of two matrices    
		int[][] c = new int[3][3]; // 3 rows and 3 columns

//adding and printing addition of 2 matrices    
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j]; // use - for subtraction
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}
	}
}