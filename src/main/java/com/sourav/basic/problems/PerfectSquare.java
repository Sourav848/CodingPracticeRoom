package com.sourav.basic.problems;

public class PerfectSquare {

	static long floorSqrt(long x) {

		long sqrt = (long) Math.sqrt(x);

		if (x % sqrt == 0)
			return sqrt;

		return sqrt;
	}

	public static void main(String[] args) {

		 long value = 36;
		// long value = 5;
		System.out.println(floorSqrt(value));
	}

}
