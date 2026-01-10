package com.exception.handling;

class Parent {
	public void m1() {
		System.out.println("hello");
	}
}
public class B extends Parent{
 public static void main(String[] args) {
	 B b1 = null;
	 
	 try {
		 b1.m1();
	 }
	
	 catch (Exception e) {
		 System.out.println(e);
	 }
	
	 
}
}
