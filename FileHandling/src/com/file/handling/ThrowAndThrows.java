package com.file.handling;


class Parent{
	void show() {
		throw new ArithmeticException();    // unchecked exception
	}
	
	void display() {
		try {
		show();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class ThrowAndThrows {
        public static void main(String[] args) {
			Parent p1 = new Parent();
			p1.display();
		}
}
