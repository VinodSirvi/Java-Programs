package com.functional.interfac;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicate_Lambda {
     public static void main(String[] args) {
		
    	 // predicate and bi predicate implementation using lembda 
    	 // no need to implements the interface 
    	 
    	 //predicate 
    	 Predicate<Integer> p = (a) -> a%2 == 0 ;
    	System.out.println( p.test(10));
    	
    	// bi predicate 
    	BiPredicate<Integer , Integer> bip = (b , c) -> b+c > 100 ;
    	System.out.println(bip.test(10, 10));
	}
}


