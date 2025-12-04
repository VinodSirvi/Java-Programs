package com.oops;

public class Demo {
        Demo() {
        	
        	System.out.println("zero arguement constructor");
        }
        
        Demo(int a) {
        	this();
        	System.out.println("one arguement constructor");
        }

       Demo(int a,int b) {
    	  this(10);
	       System.out.println("two arguement constructor");
       }
       
       public static void main(String[] args) {
    	
		Demo d3 = new Demo(10,20);
		
	}
        
        
        
}
