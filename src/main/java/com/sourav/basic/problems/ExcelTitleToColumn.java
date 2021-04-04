package com.sourav.basic.problems;

//Java program to return title
//to result of excel sheet.
import java.util.*;
import java.lang.*;

public class ExcelTitleToColumn {

//Returns resul when we pass title.
	static int titleToNumber(String s) {
		// This process is similar to
		// binary-to-decimal conversion
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result *= 26;
			result += s.charAt(i) - 'A' + 1;
		}
		return result;
	}

//Driver Code
	public static void main(String[] args) {
		System.out.print(titleToNumber("AA"));
	}
}
