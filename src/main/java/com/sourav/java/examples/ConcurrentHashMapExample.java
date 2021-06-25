package com.sourav.java.examples;

//Java program to demonstrate adding
//elements to the ConcurrentHashMap

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args)
	{
		// Creating ConcurrentHashMap
		ConcurrentHashMap<String, String> my_cmmap
			= new ConcurrentHashMap<String, String>();

		// Adding elements to the map
		// using put() method
		my_cmmap.put("1", "1");
		my_cmmap.put("2", "1");
		my_cmmap.put("3", "1");
		my_cmmap.put("4", "1");
		my_cmmap.put("5", "1");
		my_cmmap.put("6", "1");

		// Printing the map
		System.out.println("Mappings of my_cmmap : "
						+ my_cmmap);

		// create another concurrentHashMap
		ConcurrentHashMap<String, String> new_chm
			= new ConcurrentHashMap<>();

		// copy mappings from my_cmmap to new_chm
		new_chm.putAll(my_cmmap);

		// Displaying the new map
		System.out.println("New mappings are: " + new_chm);
	}
}
