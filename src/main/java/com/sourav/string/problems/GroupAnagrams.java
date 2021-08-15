package com.sourav.string.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

 //Technique : hashing

public class GroupAnagrams {

	public static List<List<String>> Anagrams(String[] string_list) {
		List<List<String>> ans = new ArrayList<>();
		HashMap<String, List<String>> hash = new HashMap<>();
		for (String i : string_list) {
			char ch[] = i.toCharArray();
			Arrays.sort(ch);
			String str = new String(ch);
			if (!hash.containsKey(str))
				hash.put(str, new ArrayList<>());
			hash.get(str).add(i);
		}
		ans.addAll(hash.values());
		return ans;
	}

	public static void main(String[] args) {

		String words[] = { "act", "god", "cat", "dog", "tac" };

		System.out.println(Anagrams(words));
	}

}
