package com.functional.interfac;
import java.util.function.Predicate;

// predicate joining ( and or negate)
// negate -- reverse the value 
// or -- 
// and --

public class PradicateJoining  {
	
	public static void checkPredicate(Predicate<Integer> ref , int [] arr ) {
		for(int i=0; i<arr.length; i++) {
			if(ref.test(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	  
    public static void main(String[] args) {
    	
            int numbers[] = {10,20,30,40,-5,100,200,231,211,111,23};    	
           	Predicate<Integer> p = a -> a>100;
            
           	Predicate<Integer> p1 = a -> a%2 == 0;
           	
            Predicate<Integer> p3 = p.negate();
            
            Predicate<Integer> p4 = p.and(p1);
            
            Predicate<Integer> p5 = p.or(p1);
            
            checkPredicate(p5 , numbers);
            
            
              
    	
  }    
	
}

