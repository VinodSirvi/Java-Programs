package com.method.reference;



interface A {
	public boolean checkSingleDigit(int x);
}

class Digit {
	public static boolean ischeckSingleDigit(int y) {
		return y>-10 && y<10;
	}
	
}
public class MethodReference {
  
	
	public static void main(String[] args) {
		
		A a1 = Digit::ischeckSingleDigit;
		System.out.println(a1.checkSingleDigit(8));
	
}
}
