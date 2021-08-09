package com.sourav.string.problems;

public class LongestSubstringWithoutRepatingCharacters {

	
	// Technique : Two Pointers
	static int lengthOfLongestSubstring(String S) {

		if (S.length() == 0)
			return 0;

		int max = Integer.MIN_VALUE;
		String curr = "";
		int start = 0, end = 0;

		while (start < S.length()) {
			if (end < S.length() && !curr.contains(String.valueOf(S.charAt(end)))) {
				curr = curr + S.charAt(end);
				max = Math.max(max, curr.length());
				end++;
			} else {
				start++;
				end = start;
				curr = "";
			}
		}
		return max;
	}

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		System.out.println(lengthOfLongestSubstring(str));//output: eksforg = 7
	}
}
