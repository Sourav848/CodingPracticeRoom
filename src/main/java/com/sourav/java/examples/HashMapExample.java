package com.sourav.java.examples;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(3, "RottenBanana");// replacing value of same key
		map.put(4, "Grapes");
		map.put(null, "BlackGrapes");
		map.put(null, "YellowGrapes"); // same for null key
	//	map.put("", "WaterMelon"); //doesn't allow
		map.putIfAbsent(7, "carrot");
		map.putIfAbsent(7, "pumkin");
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("Size of HashMap is "+map.size());
		
		System.out.println("getOrDefault method1 = "+map.getOrDefault(1, "Lichi"));
		System.out.println("getOrDefault method2 = "+map.getOrDefault(9, "Lichi"));
		
		
		// fetching value as per index
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		linkedhashmap.put(1, "firstElement");
		linkedhashmap.put(2, "secondElement");
		linkedhashmap.put(3, "thirdElement");
		
		System.out.println("First value of hashmap = "+linkedhashmap.values().toArray()[0]);
		System.out.println("Last value of hashmap = "+linkedhashmap.values().toArray()[linkedhashmap.size()-1]);
		
		
		//sorting by value
		
		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
		
		
		hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        hm.put("", 8088);
        hm.put(" ", 980);
        
        String st = "";
        System.out.println("hashcode calculation = " +st.hashCode());
		
        Map<String, Integer> sortByValueMap = hm.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
						(entry1, entry2) -> entry2, LinkedHashMap::new));

		
        System.out.println("Sort by value in map "+sortByValueMap);
	}
}