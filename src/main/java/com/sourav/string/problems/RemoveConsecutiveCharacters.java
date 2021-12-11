package com.sourav.string.problems;

//companies : Walmart

public class RemoveConsecutiveCharacters {

	public static String removeConsecutiveCharacter(String S) {

		char[] s = S.toCharArray();
		String ans = "";
		ans += s[0];
		for (int i = 1; i < S.length(); i++)
			if (s[i] != s[i - 1])
				ans += s[i];
		return ans;

	}

	public static void main(String args[]) {

		String str = "aabbcc";
		System.out.println(removeConsecutiveCharacter(str));
		// output - abc

	}

}
