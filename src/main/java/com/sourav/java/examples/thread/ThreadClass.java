package com.sourav.java.examples.thread;

public class ThreadClass {
	
	
	public static void main(String []args){
        SampleThreadOne obj1= new SampleThreadOne();
        SampleThreadTwo obj2= new SampleThreadTwo();
        
     obj1.start();
     
    try{ obj1.join();} catch(Exception e){}
     
     obj2.start();
     }

}
