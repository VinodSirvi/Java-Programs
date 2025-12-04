package com.oops;

class Animal {
	
	void Sound() {
		
		System.out.println("dog is barking");
	}
	
}


class Dog extends Animal {
	
	void show() {
		System.out.println("Class B Show Method ");
		
		Sound();
		
	}
}



public class SingleInheritnce {
 public static void main(String[] args) {
	
	 Animal A1 = new Animal();
	 Dog D1 = new Dog();
	 
	 D1.show();
	 
	 System.out.println(A1);
	 System.out.println(D1);
}
}
