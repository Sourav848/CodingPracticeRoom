package com.sourav.array.problems;

import java.util.Scanner;

//companies : DXC

public class MaxMinNumberArray {
	public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Define length of array in number"); 
        int n = input.nextInt();
        int [] arr = new int[n];  
        for (int i = 0; i < n; i++) {  
        	arr[i] = input.nextInt();
        } 
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {  
        	if(arr[i] > max)
        		max = arr[i];
        	else
        		min = arr[i];
        }
        System.out.println("maximum number in array is: "+max+" minimum number in array is: "+min); 
	}
}
