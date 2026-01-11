package com.functional.interfac;

import java.util.function.BiFunction;
import java.util.function.Function;

// Function interface 
// function interface is a functional interface 
// abstract method --> R apply(T t) ( can return any type of value)

// Function<T , R> -> t means input and R means Retrun value type 
class FunctionI implements Function<String , Integer> {
	
	public Integer apply(String s) {
		return s.length();
	}
}


// BiFunction interface 
// Bifunction is a type of interface that take two inputs 
// BiFunction< String , String , Integer > --> first two input and the 
// third one is for return 

// abstract method in BiFunction --> public R apply(Integer , Integer);
public class Function_Interface implements BiFunction<String , String , Integer>{
	
         public Integer apply(String s1 , String s2) {	
        	 return s1.length()- s2.length();
         }
         
       public static void main(String[] args) {
		
    	   // Function
    	 Function<String , Integer> f = new FunctionI();
    	System.out.println( f.apply("VinodSirvi"));
    	
    	// BiFunction
    	BiFunction<String , String , Integer> bif = new Function_Interface();
    	System.out.println(bif.apply("Vinod", "Sirvi"));
	}
}
