package com.sourav.java.examples.comparable_comparator;


//A Java program to demonstrate Comparator interface
import java.util.*;

//A class 'ComparatorMovie' that implements Comparable
class ComparatorMovie
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	/*
	 * public int compareTo(ComparatorMovie m) { return this.year - m.year; }
	 */

	// Constructor
	public ComparatorMovie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }


//Class to compare Movies by ratings


	public static void main(String[] args)
	{
		ArrayList<ComparatorMovie> list = new ArrayList<ComparatorMovie>();
		list.add(new ComparatorMovie("Force Awakens", 8.3, 2015));
		list.add(new ComparatorMovie("Star Wars", 8.7, 1977));
		list.add(new ComparatorMovie("Empire Strikes Back", 8.8, 1980));
		list.add(new ComparatorMovie("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of ratingCompare
		//				 (2) Call Collections.sort
		//				 (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (ComparatorMovie movie: list)
			System.out.println(movie.getRating() + " " +
							movie.getName() + " " +
							movie.getYear());


		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (ComparatorMovie movie: list)
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());

		
	}

}