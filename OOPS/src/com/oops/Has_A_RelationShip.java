package com.oops;

class Parent {
	int a = 10;
}

class Child {
	
	Parent a1;
	
	void show ()  {
		
		a1 = new Parent() ;
		System.out.println(a1.a);
	}
}


public class Has_A_RelationShip {

	
	public static void main(String[] args) {
		
		Child b1 = new Child();
		b1.show();
	}
}
