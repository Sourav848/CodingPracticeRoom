package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPIExample {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(65);
		numbers.add(65);
		numbers.add(41);
		numbers.add(50);
		numbers.add(20);
		numbers.add(16);
		numbers.add(2);
		numbers.add(2);
		List<Integer> list2 = new ArrayList<>();
		Collections.sort(numbers);
		Collections.sort(numbers, Collections.reverseOrder());

		// without streamAPI
		for (Integer item : numbers) {
			if (item % 2 == 0) {
				list2.add(item);
			}
		}
		System.out.println(list2);

//**** Intermediate Operation Methods****//		

//****with streamAPI filter() method that takes Predicate and returns boolean****(Synechron)
		List<Object> evenList = numbers.stream().filter(j -> j % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		List<Object> greaterthanTenAndMultipleOfFive = numbers.stream().filter(j -> j > 10).filter(j -> j % 5 == 0).collect(Collectors.toList());
		System.out.println("GreaterThan Ten multiple of 5 " +greaterthanTenAndMultipleOfFive);
		
		List<Object> greaterthanFiveMultipleOfTen = numbers.stream().filter(j -> j > 10 && j % 10 == 0).collect(Collectors.toList());
		System.out.println("GreaterThan Five and multiple of 5 " + greaterthanFiveMultipleOfTen);

		List<String> list3 = new ArrayList<>();
		list3.add("John");
		list3.add("Derek");
		list3.add("Sourav");
		list3.add("Ankit");
		list3.add("Abraham");

		List<String> listString = list3.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());
		System.out.println(listString);

		// find duplicate element in list(Thoughtworks)
		System.out.println("printing duplicates in list");
		Set<Integer> set = new HashSet<>();
		numbers.stream().filter(i -> !set.add(i)).forEach(System.out::println);
		// improvised >> numbers.stream().filter(i->!set.add(i)).distinct().forEach(System.out::println);

		// find duplicates in string
		String str = "madam";
		Set<Character> set1 = new HashSet<>();

		System.out.println("printing duplicates in string");
		str.chars().mapToObj(c -> (char) c).filter(i -> !set1.add(i)).distinct().forEach(System.out::println);

//****with streamAPI map() method that takes Function and returns value****
		List<Integer> mapOperation = numbers.stream().map(j -> j * j).collect(Collectors.toList());
		System.out.println("Map Operation = " + mapOperation);

//****with streamAPI IntStream.range() method that takes Supplier and returns value****		
		List<Integer> intStreamList = Arrays.asList(5, 9, 7, 1, 5, 2, 8);

		// whenever question comes related on index use IntStream.range
		// find odd index in the list and print the value.
		System.out.println("odd index in the list and print the value");
		IntStream.range(0, intStreamList.size()).filter(i -> i % 2 != 0).map(j -> intStreamList.get(j))
				.forEach(System.out::println);

		// IntStream.range(0,
		// list2.size()).filter(i->i%2!=0).map(list2::get).forEach(System.out::println);


//**** with streamAPI sorted() method that takes Comparator and sort the list

		System.out.println("Sorting with the help of sorted() method");
		numbers.stream().sorted().forEach(System.out::println);

		System.out.println("Sorting in decreasing order");
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("Largest Number " + numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get());
		
		System.out.println("First Three Largest Number " + numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));


//**** with streamAPI distinct() method, will remove duplicate number
		List<Integer> distinctElements = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Using distinct() method for unique numbers are " + distinctElements);

		
		
//**** Terminal Operation Methods****//

//**** with streamAPI count() method of terminal operation		

		long count = numbers.stream().filter(number -> number == 65).count();
		System.out.println("Total count of list is " + count);

//**** with streamAPI toMap() method of terminal operation converting List to Map

		List<Integer> listToMap = new ArrayList<>();

		listToMap.add(1);
		listToMap.add(2);
		listToMap.add(65);
		listToMap.add(41);
		listToMap.add(50);
		listToMap.add(16);

		Map<Object, Object> map = listToMap.stream().collect(Collectors.toMap(s -> listToMap.indexOf(s), s -> s));

		for (Entry<Object, Object> entry : map.entrySet()) {

			System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
		}
		
//****with streamAPI forEach() method that takes Consumer and returns nothing****
				numbers.stream().forEach((j) -> {
					try {
						int a = j / 0;
						System.out.println(j);
					} catch (Exception e) {
						System.out.println("Catch block");
					} finally {
						System.out.println("Finally block");
					}
				});

//**** with streamAPI toMap() method of terminal for sum of List
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of list is = " + sum);

//**** with streamAPI max() method of max value in list
		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
		
		//Alternate
		//Integer max = numbers.stream().max(Comparator.comparing(Integer::intValue)).get();

		if (max.isPresent())
			System.out.println("Maximum number in List: " + max.getAsInt());

//**** with streamAPI groupingBy() method - when you want vs vs vs
		String input = "AABBBBDDCCCCCEEEEEEHG";

		// Using Java Stream API to find frequency of characters(TechMahindra)
		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		// Display the frequency map
		frequencyMap.forEach((character, frequency) -> System.out.println(character + ": " + frequency));

		//max occurrence in String		
        System.out.println("max occurrence in String is: " + frequencyMap.entrySet().stream()
        		.sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).findFirst().get().getKey());
		
        //second max occurrence in String
		System.out.println("Second max occurrence in String is: " + frequencyMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).skip(1).findFirst().get().getKey());

		
		// First non repeating character
		LinkedHashMap<Character, Long> frequencyLinkedMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())); // Store the chars
																									// in map with count
		System.out.println("first non repeating : " + frequencyLinkedMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).findFirst().get().getKey());
		
		//alternative
		//frequencyLinkedMap.entrySet().stream().filter(entry-> entry.getValue() == 1L).findFirst().get().getKey();
		
		// second max salary(accenture, coforge, synechron)
		int secondMaxSalary = numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

		// max length word in String(EPAM)
		String str2 = "Welcome to EPAM";
		/*String res = Arrays.asList(str2.split(" ")).stream().max((i, j) -> Integer.compare(i.length(), j.length()))
				.get();*/
		
		String res = Arrays.asList(str2.split(" ")).stream().max(Comparator.comparing(String::length)).get();
		
		
		System.out.println("max Lenght word is :" + res);

	}
}
