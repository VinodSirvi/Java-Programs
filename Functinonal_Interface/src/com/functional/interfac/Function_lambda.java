package com.functional.interfac;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Function_lambda {
     public static void main(String[] args) {
		
    	 //Function
    	 Function<String ,Integer> p = s -> s.length();
    	System.out.println( p.apply("Vinod"));
    	
    	//BiFunction
    	BiFunction<String , String , Integer> p1 = (s1 , s2) ->
    	s1.length() - s2.length();
    	System.out.println(p1.apply("Vinod", "hi"));
	}
}
