package com.sourav.basic.problems;

public class LcmGcd {

	static int[] lcmAndGcd(int A, int B) {
		// code here
		int[] ar = new int[2];
		int gcd = gcd(A, B);
		ar[1] = gcd;
		ar[0] = (A / gcd) * B;
		return ar;
	}

	//Euclidean algorithm .
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		int[] arr = lcmAndGcd(a, b);
		System.out.println("LCM of " + a + " and " + b + " is " + arr[0]);
		System.out.println("GCD of " + a + " and " + b + " is " + arr[1]);
	}
}
