package com.sourav.java.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	static void entrySet() {

		Map<String, String> gfg = new HashMap<String, String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String, String> entry : gfg.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

	static void keySet() {

		Map<String, String> gfg = new HashMap<String, String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// using keySet() for iteration over keys
		for (String name : gfg.keySet())
			System.out.println("key: " + name);

		// using values() for iteration over values
		for (String url : gfg.values())
			System.out.println("value: " + url);
	}

	static void iterators() {
		Map<String, String> gfg = new HashMap<String, String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// using iterators
		Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

	static void lambdas() {
		Map<String, String> gfg = new HashMap<String, String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// forEach(action) method to iterate map
		gfg.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
	}

	public static void main(String[] arg) {

		// Iterating over Map.entrySet() using For-Each loop
		System.out.println("Iterating over Map.entrySet() using For-Each loop");
		entrySet();

		// Iterating over keys or values using keySet() and values() methods
		System.out.println("Iterating over keys or values using keySet() and values() methods");
		keySet();

		// Iterating using iterators over Map.Entry<K, V>
		System.out.println("Iterating using iterators over Map.Entry<K, V>");
		iterators();

		// Using With Lambdas
		System.out.println("Using with lambdas");
		lambdas();

	}

}
