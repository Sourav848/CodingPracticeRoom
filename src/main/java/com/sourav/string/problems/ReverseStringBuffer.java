package com.sourav.string.problems;
import java.util.*;

public class ReverseStringBuffer {
	
   public static String reverseWord(String str){  
		
		if (str.length() > 1000)
			return null;
		
	    String words[]=str.split("\\s");  
	  //  char words1[]= str.toCharArray();
	  //  List<String> list = new ArrayList<>(Arrays.asList(words));
	    String reverseWord="";  
	    Collections.reverse(Arrays.asList(words)); 
	    for(String w:words){  
	        reverseWord+=w+" ";  
	    }  
	    return reverseWord;  
	}  
	
	
    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s1.append(scan.nextLine());
        System.out.println("Revrse String is: "+s1.reverse());
        
    		
		String str = "Hello World, It's a beautiful day!";
		System.out.println(reverseWord(str));
		//output -  day! beatiful a It's World, Hello 
    	
    }
}