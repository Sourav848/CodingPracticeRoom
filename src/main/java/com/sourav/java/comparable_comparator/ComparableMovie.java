package com.sourav.java.examples.comparable_comparator;


//A Java program to demonstrate use of Comparable
import java.util.*;

//A class 'ComparableMovie' that implements Comparable
class ComparableMovie implements Comparable<ComparableMovie>
{
	private double rating;
	private String name;
	private int year;


	// Constructor
	public ComparableMovie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
	
	
	// Used to sort movies by year
		public int compareTo(ComparableMovie m)
		{
			return this.year - m.year;
		}


//Driver class

	public static void main(String[] args)
	{
		ArrayList<ComparableMovie> list = new ArrayList<ComparableMovie>();
		list.add(new ComparableMovie("Force Awakens", 8.3, 2015));
		list.add(new ComparableMovie("Star Wars", 8.7, 1977));
		list.add(new ComparableMovie("Empire Strikes Back", 8.8, 1980));
		list.add(new ComparableMovie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting on the  basis of year : ");
		for (ComparableMovie movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}
