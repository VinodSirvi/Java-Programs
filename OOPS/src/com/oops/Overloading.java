package com.oops;

 class A {

	int a = 19;
    void m1(int b , int c) {
		
		System.out.println(" Class A addition="+(b+c));
	}
	
	void m1(int d ,int e ,int f) {
		
		System.out.println("multiplication="+d*e*f); 
	}
	
	
}
 
 class B extends A{
	 
    void m1(int b,int c) {
		  System.out.println("class B add="+(b+c));
	  }
 }

public class Overloading {
	
	public static void main(String[] args) {
		
		A a1 = new B();
		a1.m1(1, 1,1);
		
		a1.m1(5, 10);
		
	}
}
