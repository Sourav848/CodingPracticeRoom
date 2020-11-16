package com.sourav.collections.problems;

import java.util.*; 

public class ArrayListJavaCollection {
	
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr, int size) {
	    // Write your code here
	    //ArrayList<Integer> arr=new ArrayList<Integer>();
	        // Write your code here
		int j =0;
	        for (int i = 0;i<d;i++){
	            int temp = arr.get(0);
	            for (j = 0; j<size-1; j++){
	                arr.set(j, arr.get(j+1));
	            }
	            arr.set(j, temp);
	        } return arr;
	    }
	
	public static void main(String args[]){  
		//ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);//Adding object in arraylist  
		arr.add(2);  
		arr.add(3);  
		arr.add(4);
		arr.add(5);
		List<Integer> list = rotateLeft(2, arr, arr.size());
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.print(" "+itr.next());  
		}

	    
		}  

}
