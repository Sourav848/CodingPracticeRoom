package com.sourav.basic.problems;

//Java program to return title
//to result of excel sheet.

public class ExcelTitleToColumn {

//Returns resul when we pass title.
	static int titleToNumber(String s) {
		// This process is similar to
		// binary-to-decimal conversion
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result *= 26;
			result += s.charAt(i) - 'A' + 1;
			//System.out.print("AA" + ('C' - 'A'));
		}
		return result;
	}

//Driver Code
	public static void main(String[] args) {
		System.out.print(titleToNumber("AA"));
		//int low = 'A' - 'B';
	//	System.out.print("ascii = "+low);
	}
	
}
