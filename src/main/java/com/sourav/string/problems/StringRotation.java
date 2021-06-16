package com.sourav.string.problems;


public class StringRotation    
{    
	
	/*
	 * The java string indexOf() method returns index of given character value or
	 * substring. If it is not found, it returns -1. The index counter starts from
	 * zero.
	 */
    public static void main(String[] args) {    
        String str1 = "abcde", str2 = "deabc";  
       //boolean areRotation =  areRotations(str1, str2);
            
        if(str1.length() != str2.length()){    
            System.out.println("Second string is not a rotation of first string");    
        }    
        else {    
            //Concatenate str1 with str1 and store it in str1    
            str1 = str1.concat(str1);    
             //Check whether str2 is present in str1    
            if(str1.indexOf(str2) != -1)    
                System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string");    
        }    
    }    
    
    static boolean areRotations(String str1, String str2)
	{
      String temp = str1.concat(str1);
      int len = str2.length();
      
      for (int i=0; i<temp.length(); i++) {
      String rotateValue = temp.substring(i, i+len);        
        if (rotateValue.equals(str2))
           return true;
      }
      return false;
	}
}     