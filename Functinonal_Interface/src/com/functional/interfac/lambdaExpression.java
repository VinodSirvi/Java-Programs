package com.functional.interfac;

interface I {
	//abstract method
	void display();
}

interface I2 {
	//abstract method
	void StringLength(String s);
}
interface I3{
	// abstract method 
	void add(int a , int b);
}


public class lambdaExpression {
    public static void main(String[] args) {
    // lambda expression
        	
    // type 1 of declaration
    I i1 = ()-> System.out.println("lambda Expression");
        	
    // type 2 of declaration
    I2 i2 = s -> System.out.println("stringlength=>"+s.length());
        	i2.StringLength("VinodSirvi");
        	
    // type 3  of declaration
    I3 i3 = (a ,b)->{ 
       if(a>b) {
        System.out.println("a is big");
        	}
       else System.out.println("b is big");
     };
       i3.add(10,20);
   }
} 
