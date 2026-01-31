package com.stream.api;

interface Car {
	void engine();
}
public class AnonymousClass {
   public static void main(String[] args) {
	     
	   // its not a object of interface // we can create only reference of an interface 
	   // its a Anonymous inner class that defining the interface method 
	   // no need to implements the interface 
	   // direct define the method 
	   
	   Car c1 = new Car() {
		   public void engine() {
			   System.out.println("engine starting");
		   }
	   };
	   
	   
}
}
