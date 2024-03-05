package com.sourav.string.problems;

//companies : practo

public class LongestRepeatingSequence {

	public static String lcp(String s1, String s2) { // longest common prefix algo
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
	}

	public static void main(String[] args) {
		String str = "acbdfghybdf";
	//	String str = "aabcabab"; //output : ab
		String lrs = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// Checks for the largest common factors in every substring
				String x = lcp(str.substring(i, n), str.substring(j, n));
				// If the current prefix is greater than previous one
				// then it takes the current one as longest repeating sequence
				if (x.length() > lrs.length())
					lrs = x;
			}
		}
		System.out.println("Longest repeating sequence: " + lrs);
	}
}
