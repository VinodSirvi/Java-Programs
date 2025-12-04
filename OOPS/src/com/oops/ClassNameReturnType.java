package com.oops;

public class ClassNameReturnType {

	// return type is the name of class 
	//because we are returning this that is current object 
	
	ClassNameReturnType show() {
		
		return this;
		
	}
	
	
	public static void main(String[] args) {
		
		ClassNameReturnType a1 = new ClassNameReturnType();
		
		System.out.println(a1.show());
		
	}
	
}
