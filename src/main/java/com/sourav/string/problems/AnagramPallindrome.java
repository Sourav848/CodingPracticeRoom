package com.sourav.string.problems;

import java.util.HashMap;
import java.util.Map;

public class AnagramPallindrome {

	/*if occurrence of letter in word consist an odd number more than 1 then 
	that word cannot be converted in pallindrome*/
	
	static int isPossible(String s) { 
		
		Map<Character, Integer> map = new HashMap<>();

		// Occurrence
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}
        
		//checking for odd number in occurrence of letter
		int count = 0;
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() % 2 != 0)
				count++;
		}
		if (count > 1)
			return 0;

		return 1;
	}

	public static void main(String args[]) {

		  String str = "maadm"; //Explanation: The string can be converted into a palindrome: maadm can be madam and madam is pallindrom
		//String str = "nose"; //Explanation: The string cannot be converted into a palindrome.
		if (isPossible(str) == 1)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
