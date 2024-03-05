package com.sourav.java.examples;

import java.util.Optional;

public class OptionalClass {

	static Optional<String> changeCase(String word) {
		if (word != null && word.startsWith("A")) {
			return Optional.of(word.toUpperCase());
		} else {
			return Optional.ofNullable(word); // someString can be null
		}
	}

	public static void main(String[] args) {

		System.out.println(changeCase("ka"));
		System.out.println(changeCase("AkA").get());
		System.out.println(changeCase(null));
		System.out.println(changeCase("KA").isEmpty());
		System.out.println(changeCase("KA").isPresent());
		
	}
}
