package com.sourav.java.comparable_comparator;

import java.util.Comparator;

class RatingCompare implements Comparator<ComparatorMovie>
{
	public int compare(ComparatorMovie m1, ComparatorMovie m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
	
	 /*@Override
	    public int compare(ComparatorMovie m1, ComparatorMovie m2) {
	        // For descending order
	        if (m1.getRating() > m2.getRating()) return -1;
	        if (m1.getRating() < m2.getRating()) return 1;
	        else return 0;
	    }*/
}
