package com.sourav.java.examples;

class Car{
	   public Car()
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
	class Maruti extends Car{
	   public Maruti()
	   {
		System.out.println("Class Maruti");
	   }
	   public Maruti(String a)
	   {
		System.out.println("Class Maruti");
	   }
	   public void Car()
	   {
		System.out.println("Class Maruti12");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
	public class MultilevelInheritance extends Maruti {

	   public MultilevelInheritance()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 MultilevelInheritance obj=new MultilevelInheritance();
		 obj.speed();
		 obj.brand();
		 obj.vehicleType();
	   }
	}