package com.sourav.string.problems;

public class Permutation {

//Java program to print all the permutations
//of the given string
	
	public String swap(String str, int i, int j)
	{
		char[] charArray = str.toCharArray();
		
		char temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		//System.out.println(String.valueOf(charArray));
		return String.valueOf(charArray);
	}

	/**
	* permutation function
	* @param str string to calculate permutation for
	* @param l starting index
	* @param r end index
	*/
	private void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	/**
	* Swap Characters at position
	* @param a string value
	* @param i position 1
	* @param j position 2
	* @return swapped string
	*/
	
	
	
	public static void main(String[] args)
	{
        String str = "DEF";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n-1);
	}
	
	
}