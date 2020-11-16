package com.sourav.basic.problems;

import java.util.Scanner;

class rough implements Runnable {

	   private Thread t;
	   private String threadName;
	   
	   rough (String threadName){
	       this.threadName = threadName;
	   }

	   public void run() 
	   {
	       while (true)
	            System.out.print(threadName);
	   }

	   public void start ()
	   {
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	 class TestThread {

	   public static void main(String args[]) {

	      rough A = new rough( "A");
	      rough B = new rough( "B");

	      B.start();
	      A.start();
	   }
	}
