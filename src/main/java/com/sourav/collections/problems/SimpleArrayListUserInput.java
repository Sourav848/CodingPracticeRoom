package com.sourav.collections.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArrayListUserInput {

	public static void main(String args[]) {
		List l = new ArrayList();
		System.out.println("Enter the input");
		Scanner input = new Scanner(System.in);

		String a = input.nextLine();
		l.add(a);
		// use this to iterate the value inside the arraylist.
		/*
		 * for (int i = 0; i < l.size(); i++) { System.out.println(l.get(i)); }
		 */
		System.out.println(l);

	}

}
