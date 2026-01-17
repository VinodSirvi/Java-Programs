package com.oops;

public class ObjectReferenceParameter {
	
	void hello(ObjectReferenceParameter d) {
		
		System.out.println("object received");
	}
	
	void call() {
		
		System.out.println(this);
	
	}
	
	public static void main(String[] args) {
		
		ObjectReferenceParameter a1 = new ObjectReferenceParameter();
		
		a1.hello(a1);
		a1.call();
	}

}
