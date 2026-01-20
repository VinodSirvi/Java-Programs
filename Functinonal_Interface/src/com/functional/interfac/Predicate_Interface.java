package com.functional.interfac;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//Bi Predicate implementation
// it will take two input parameters , can be different or same 
class BiPredicat implements BiPredicate<Integer , Integer>{
	
	public boolean test(Integer a , Integer b) {
		
		if(a+b >=20) {
			System.out.println("bi predicate output");
			return true;
		}
		else return false;
	}
	
}

//predicate implementation
//predicate Single abstract method --> test(T t)
public class Predicate_Interface implements Predicate<Integer>  {
	
	   public boolean test(Integer i) {
		   
		   if(i%2==0) {
			   System.out.println("predicate output");
			   return true;
		   }
		   
		   else return false;
	   }
	
    public static void main(String[] args) {
		// predicate 
    	Predicate<Integer> p = new Predicate_Interface();
    	System.out.println(p.test(10));
    	
    	// BiPredicate
    	BiPredicate<Integer , Integer> bip = new BiPredicat();
    	System.out.println(bip.test(10, 20));
    	
	}
        
}
