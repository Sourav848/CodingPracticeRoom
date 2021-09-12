package com.sourav.array.problems;

class RotateRight {  
	
	
	static int[] rotRight(int[] a, int k) {
    	int n = a.length;
    	int[] arr = new int[n];
    	
    	for (int i = 0; i < n; i++)
        {
    		arr[(i + k) % n] = a[i];
        }
    	
    	return arr;
    }
	
	
    public static void main(String[] args) {  
        
    	 int [] arr  = {1, 2, 3, 4, 5};  
         int [] arr1 = {1, 2, 3, 4, 5}; 
         //n determine the number of times an array should be rotated  
         int n  = 3;  
         int n1 = 2;  
         
         rotRight(arr1, n1);
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, last;  
            //Stores the last element of the array  
            last = arr[arr.length-1];  
            for(j = arr.length-1; j > 0; j--){  
                //Shift element of array by one  
                arr[j] = arr[j-1];  
            }  
            //First element of array will be added to the end  
            arr[j] = last;  
        }  
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after right rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  