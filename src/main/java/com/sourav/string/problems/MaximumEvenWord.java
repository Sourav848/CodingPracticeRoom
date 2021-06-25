package com.sourav.string.problems;

public class MaximumEvenWord {

	public static void main(String args[]) {

		String str = "this is string a test pakistan landthetruth";

		System.out.println(findMaxLenEven(str));

	}

	// Function to find maximum length even word
	static String findMaxLenEven(String str) {

		int n = str.length();

		int i = 0;

		// To store length of current word.
		int previdx = 0;

		// To store length of maximum length word.
		String maxEvenString = "";

		String word = "";

		// To store starting index of maximum
		// length word.
		for (i = 0; i < n; i++) {

			if (str.charAt(i) == ' ' || i == n-1) {
				word = str.substring(previdx, i+1);
				word = word.trim();

				if (word.length() > 1 && word.length() % 2 == 0 && word.length() > maxEvenString.length())
					maxEvenString = word;
             previdx = i + 1;
			}
		}

		return maxEvenString;

	}

}
