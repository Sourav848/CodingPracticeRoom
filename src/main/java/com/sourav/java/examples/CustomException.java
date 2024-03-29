package com.sourav.java.examples;


class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s) {  //change to int will throw error coz constructor in exception class having method
	  super(s);  
	 }  
	}  


public class CustomException {

	static void validate(int age) throws InvalidAgeException {  //throws keyword custom exception
	     if(age<18)  
	      throw new InvalidAgeException("not valid");   //throw keyword custom exception
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	   
	   //validate(13) with try and catch handled >> ;
	
	
}
