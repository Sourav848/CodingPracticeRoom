package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
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
		
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		long count = numbers.stream().filter(number -> number == 65).count();
		System.out.println("Total count of list is "+count);
		
		
		//unique number
		List<Integer> distinctElements =  numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("unique number is "+ distinctElements);
		
		//method reference
		numbers.stream().forEach(System.out::println);
		
		//List to Map
		
		List<Integer> listToMap = new ArrayList<Integer>();
		
		listToMap.add(1);
		listToMap.add(2);
		listToMap.add(65);
		listToMap.add(41);
		listToMap.add(50);
		listToMap.add(16);
		
		Map<Integer, Integer> map = listToMap.stream().collect(Collectors.toMap(s -> s++, s -> 0));
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			System.out.print(entry.getKey()+"="+entry.getKey()+", ");
		}
		
		//sum
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
         System.out.println("sum of list is = "+ sum);
         
         
         //max
         OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();

          if(max.isPresent())
           System.out.println("Maximum number in List: "+max.getAsInt());
	}
	
}
