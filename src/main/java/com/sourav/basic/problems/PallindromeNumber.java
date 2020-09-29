package com.sourav.basic.problems;

import java.util.Scanner;

public class PallindromeNumber {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string or number");
		int i = 1;
		while (i > 0) {		
			String str = sc.next();
			String rev = "";		 
			for (int j = (str.length() - 1); j >= 0 ; j--) {
				rev = rev + str.charAt(j);
			}		
			if (rev.equals(str)) 
				System.out.println(str + " is a pallindrome");
			else
				System.out.println(str + " is not a pallindrome");
		}
	}
}
