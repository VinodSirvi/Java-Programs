package com.exception.handling;

public class A {
 public static void main(String[] args) {
	int a = 10;
	int b = 0;
	
	
	System.out.println("start");
	
	
	try {
		int c = a/b;
	}
   
	catch (Exception e){
		System.out.println(e);
	}
	
	System.out.println("end");
}
}



