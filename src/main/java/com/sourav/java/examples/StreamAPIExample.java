package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		
		
//**** Intermediate Operation Methods****//		
		
		
	
//****with streamAPI filter() method that takes Predicate and returns boolean****  n
		List<Object> evenList = numbers.stream().filter(j -> j%2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Object> greaterthanten = numbers.stream().filter(j -> j>10).collect(Collectors.toList());
		System.out.println(greaterthanten);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("John");
		list3.add("Derek");
		list3.add("Sourav");
		list3.add("Ankit");
		list3.add("Abraham");
		
		List<String> listString = list3.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());
		System.out.println(listString);
		
		//find duplicate element in list
		System.out.println("printing duplicates in list");
		Set<Integer> set = new HashSet<>();
		numbers.stream().filter(i-> !set.add(i)).forEach(System.out::println);
		//improvised >>  numbers.stream().filter(i-> !set.add(i)).distinct().forEach(System.out::println);
		
		//find duplicates in string
		String str="madam";
		Set<Character> set1 = new HashSet<>();
		
		System.out.println("printing duplicates in string");
		str.chars().mapToObj(c->(char) c).filter(i->!set1.add(i)).distinct().forEach(System.out::println);
		 
		
//****with streamAPI map() method that takes Function and returns value****
		List<Integer> mapOperation = numbers.stream().map(j -> j*j).collect(Collectors.toList());
		System.out.println("Map Operation = "+mapOperation);	
		

//****with streamAPI IntStream.range() method that takes Supplier and returns value****		
		List<Integer> intStreamList= Arrays.asList(5,9,7,1,5,2,8);
		
		
		//whenever question comes related on index use IntStream.range
		//find odd index in the list and print the value.
		System.out.println("odd index in the list and print the value");
		IntStream.range(0, intStreamList.size()).filter(i->i%2!=0).map(j->intStreamList.get(j)).forEach(System.out::println);

		//IntStream.range(0, list2.size()).filter(i->i%2!=0).map(list2::get).forEach(System.out::println);
		
		
		
//****with streamAPI forEach() method that takes Consumer and returns nothing****
		numbers.stream().forEach(
		 (j) -> {
			 try {
				int a = j/0;
			System.out.println(j);
			 } catch(Exception e) {
				 System.out.println("Catch block");
			 } finally {
				 System.out.println("Finally block");
			 }
		});

//**** with streamAPI sorted() method that takes Comparator and sort the list
		
		System.out.println("Sorting with the help of sorted() method");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("Sorting in decreasing order");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
//**** with streamAPI distinct() method, will remove duplicate number
		List<Integer> distinctElements =  numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Using distinct() method for unique numbers are "+ distinctElements);
		

		
		
//**** Terminal Operation Methods****//
		
		
//**** with streamAPI count() method of terminal operation		
		
		long count = numbers.stream().filter(number -> number == 65).count();
		System.out.println("Total count of list is "+count);
		
		
		
//**** with streamAPI toMap() method of terminal operation converting List to Map
		
		List<Integer> listToMap = new ArrayList<Integer>();
		
		listToMap.add(1);
		listToMap.add(2);
		listToMap.add(65);
		listToMap.add(41);
		listToMap.add(50);
		listToMap.add(16);
		
		Map<Object, Object> map = listToMap.stream().collect(Collectors.toMap(s -> s, s -> "Value_" + s));
		
		for (Entry<Object, Object> entry : map.entrySet()) {
			
			System.out.print(entry.getKey()+"="+entry.getValue()+", ");
		}
		
		
//**** with streamAPI toMap() method of terminal for sum of List
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
         System.out.println("sum of list is = "+ sum);
         
         
//**** with streamAPI toMap() method of max value in list
         OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();

          if(max.isPresent())
           System.out.println("Maximum number in List: "+max.getAsInt());
          
          
//**** with streamAPI groupingBy() method
          String input = "AABBBBDDCCCCCEEEEEE";

          // Using Java Stream API to find frequency of characters(TechMahindra)
          Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i->i, Collectors.counting()));

          // Display the frequency map
          frequencyMap.forEach((character, frequency) -> System.out.println(character + ": " + frequency));
          
        Character maxOccurance =   frequencyMap.entrySet().stream().max((i,j)->Long.compare(i.getValue(), j.getValue())).get().getKey();
         
        
        //rough work
        
     List<Integer> list = new ArrayList<Integer>();
		
     list.add(2);
     list.add(4);
     list.add(5);
     list.add(2);
     list.add(6);

		System.out.println("Largest Number " + list.stream().sorted(Comparator.reverseOrder()).findFirst().get());
		System.out.println(frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get().getKey());
		
        
        System.out.println("max occurance in String is: " + maxOccurance);
        
          //second max salary(accenture, coforge)
          int secondMaxSalary = numbers.stream()
        	        .sorted(Collections.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new RuntimeException("No second highest salary"));
        	System.out.println("Second max salary: " + secondMaxSalary);
        	
        	
          
   		

	}
}
