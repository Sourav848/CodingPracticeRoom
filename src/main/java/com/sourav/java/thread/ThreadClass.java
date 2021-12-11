package com.sourav.java.examples.thread;

public class ThreadClass {
	
	
	public static void main(String []args){
        SampleThreadOne obj1= new SampleThreadOne();
        SampleThreadTwo obj2= new SampleThreadTwo();
        
     obj1.start();
 //try{ Thread.sleep(10);} catch(Exception e){}
     obj2.start();
     }

}
