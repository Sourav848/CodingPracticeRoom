package com.sourav.array.problems;

import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Define length of array in number"); 
        int n = input.nextInt();
        int [] arr = new int[n];  
        for (int i = 0; i < n; i++) {  
        	arr[i] = input.nextInt();
        } 
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        } 
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");
        }  
    }  
}  