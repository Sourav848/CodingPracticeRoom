package com.sourav.basic.problems;

public class PerfectSquare {

	static long floorSqrt(long x) {

		long sqrt = (long) Math.sqrt(x);

		if (x % sqrt == 0)
			return sqrt;

		return sqrt;
	}
	
	static long perefectSquareRoorWithoutMethod(long x) {

		int prev = 1;
		int res = 0;
		for (int i = 1; i < x; i++) {
			if (i * i == x) {
				res = i;
				break;
			}
			prev = i * i;
			if (prev > x)
				return i;
		}
		return res;
	}

	public static void main(String[] args) {

		 long value = 36;
		// long value = 5;
		System.out.println(floorSqrt(value));
		System.out.println("Square root without using inbuilt method : "+perefectSquareRoorWithoutMethod(value));
	}

}
