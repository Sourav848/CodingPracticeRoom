package com.sourav.basic.problems;


public class rough {

	public static void main(String[] args) {
		System.out.println("Hello World");

		int n = 5;

		for (int i = 0; i < 10; i = i + n) {
			int n1 = i;
			int n2 = n + i;

			if (i == n1 && i < n2 && n2 < 10) { // subset according to n range
				System.out.println("range" + i + "to" + (n2 - 1));
				// print("range"+i "to" +(n2-1))
			} else { // to handle remainder of subset
				int remain = 9 - i;
				if (remain != 0)
					System.out.println("range" + i + "to" + "9");
				else
					System.out.println("range" + i);
			}

		}
	}
}