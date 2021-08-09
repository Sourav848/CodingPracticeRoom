package com.sourav.basic.problems;

public class CountSquares {

	static int countSquares(int N) {
		int count = 0;

		for (int i = 1; i * i < N; i++) {
			count++;
		}

		return count;
		// code here
	}

	public static void main(String[] args) {

		//int n = 9; //output : 2 ---> 1, 2
		 int n = 17; //output : 4 ----> 1, 2, 3, 4
		System.out.println("Total Number of squares are under " + n + " is " + countSquares(n));
        
		//System.out.println(Math.sqrt(16)); //return type double
	}
}
