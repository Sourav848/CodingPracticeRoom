package com.sourav.string.problems;

//Java program to find n'th
//term in look and say sequence

class CountAndSay
{

	// Returns n'th term in
	// look-and-say sequence
	static String countnndSay(int n)
	{
	// Base cases
	if (n == 1)	 return "1";
	if (n == 2)	 return "11";
	
	// Initialize previous term
	String str = "11";
	for (int i = 3; i <= n; i++)
	{
		// In below for loop, previous
		// character is processed in
		// current iteration.
		//That is
		// why a dummy character is
		// added to make sure that loop
		// runs one extra iteration.
		str += '$';
		int len = str.length();

		int cnt = 1; // Initialize count
					// of matching chars
		String tmp = ""; // Initialize i'th
						// term in series
		char []arr = str.toCharArray();
		
		// Process previous term
		// to find the next term
		for (int j = 1; j < len; j++) //to hold count and value of previous nth value till final n value
		{
			// If current character
			// does't match
			if (arr[j] != arr[j - 1])
			{
				// Append of count
				tmp += cnt + 0;

				// Append of value str[j-1]
				tmp += arr[j - 1];

				// Reset count
				cnt = 1;
			}

			// If matches, then increment
			// count of matching characters
			else cnt++;
		}

		// Update str
		str = tmp;
	}

	return str;
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		int N = 4; // for 3 = count 2 value 1 = 21 -- N=4, 1211
		System.out.println(countnndSay(N));
	}
}

