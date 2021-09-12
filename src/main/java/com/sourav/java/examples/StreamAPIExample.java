package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(65);
		numbers.add(65);
		numbers.add(41);
		numbers.add(50);
		numbers.add(16);
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		//without streamAPI
		for (Integer item : numbers) {
			if (item%2 == 0) {
				list2.add(item);
			}
		}
		System.out.println(list2);
		
		
		
		//with streamAPI filter() method that takes Predicate and returns boolean
		List<Integer> evenList = numbers.stream().filter(j -> j%2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> greaterthanten = numbers.stream().filter(j -> j>10).collect(Collectors.toList());
		System.out.println(greaterthanten);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("John");
		list3.add("Derek");
		list3.add("Sourav");
		list3.add("Ankit");
		list3.add("Abraham");
		
		List<String> listString = list3.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());
		System.out.println(listString);
		
		
		//with streamAPI map() method that takes Function and returns value
		List<Integer> mapOperation = numbers.stream().map(j -> j*j).collect(Collectors.toList());
		System.out.println("Map Operation = "+mapOperation);		
		
		//with streamAPI forEach() method that takes Consumer and returns value
		numbers.stream().forEach(
		 j -> {
			 try {
				int a = j/0;
			System.out.println(j);
			 } catch(Exception e) {
				 System.out.println("Catch block");
			 } finally {
				 System.out.println("Finally block");
			 }
		});
		
		long count = numbers.stream().filter(number -> number == 65).count();
		System.out.println("Total count of list is "+count);
		
		
		//unique number
		List<Integer> distinctElements =  numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("unique number is "+ distinctElements);
	}

}
