package com.sourav.string.problems;

public class RemoveWhiteSpace {
	
	 public static void main(String[] args) {    
         
	        String str1="Remove white spaces";    
	            
	        //Removes the white spaces using regex    
	        str1 = str1.replaceAll(" ", "");   //string, string 
	            
	        System.out.println("String after removing all the white spaces : " + str1);    
	    }    

}
