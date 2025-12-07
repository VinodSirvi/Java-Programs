// Use of Interface
package com.oops;

interface I2 {
	
	void show() ;
	
	int a = 10;
}

class Parent implements I2 {
	
	public void show () {
		
		System.out.println("interface method");
	}
	
	Parent() {
		System.out.println("class abs method");
	}
}
class Child extends Parent {
	
	Child () {
		
		System.out.println("class driver method call");
	}
	
}
public class Interface {
	
	public static void main(String[] args) {
		
		I2 i = new Child();        // type 03
		System.out.println(i.a);
		
		I2 i2 = null;             // type 04
		i2 = new Child();
		
		i2.show();
 }
}
