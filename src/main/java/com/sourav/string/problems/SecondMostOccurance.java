package com.sourav.string.problems;

import java.util.HashMap;
import java.util.Map;

public class SecondMostOccurance {
	
	static String secFrequent(String arr[], int N)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i=0; i<N; i++) {
            if (!map.containsKey(arr[i]))
               map.put(arr[i], 1);
             else 
               map.put(arr[i], map.get(arr[i]) + 1);
        }
        
        int firstMaxFrequency = Integer.MIN_VALUE;
        int secondMaxFrequency = Integer.MIN_VALUE;
        String first = "";
        String second = "";
         
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            
            if(entry.getValue() > firstMaxFrequency) {
                secondMaxFrequency = firstMaxFrequency;
                second = first;
                firstMaxFrequency = entry.getValue();
                first = entry.getKey();
          }  else if(entry.getValue() > secondMaxFrequency && firstMaxFrequency != secondMaxFrequency) {
                secondMaxFrequency = entry.getValue();
                second = entry.getKey();
                
             }
           }
           
           return second;
        }
	
	public static void main(String[] arg) {
		
		int N = 6;
	    String	arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
	    
	    System.out.println("Second Most frequent string is : "+secFrequent(arr, N));
	}

}
