package com.sourav.java.comparable_comparator;

import java.util.Comparator;


//Class to compare Movies by name
class NameCompare implements Comparator<ComparatorMovie>
{
	public int compare(ComparatorMovie m1, ComparatorMovie m2)
	{
		return m1.getName().compareTo(m2.getName());
		//for descending
		//return m2.getName().compareTo(m1.getName());
	}

}
