package com.sourav.basic.problems;

public class ATOI {
	
	static int count = 10;

	static int i = 1;

	static int atoi(String str) {
		// Your code here
		char[] C = str.toCharArray();
		for (int i = 0; i < C.length; i++) {

			if (!Character.isDigit(C[i]) && !str.contains("_"))
				return -1;
		}

		return Integer.parseInt(str);
	}

	public static void main(String[] args) {
		String str = "-12";
		System.out.println(atoi(str));
	}
}
