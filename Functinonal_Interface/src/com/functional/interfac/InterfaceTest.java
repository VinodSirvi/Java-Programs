package com.functional.interfac;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;



public class InterfaceTest  {
	
	public static void main(String[] args) {
		
		// predicate 
		
	    Consumer<Integer> con = (c) -> System.out.println(c);
	    con.accept(10);
	    
	    BiConsumer<Integer , Integer> bic = (a ,b) -> System.out.println(a+b);
	    
	    Function<String , Integer> fun = (str) -> str.length();
	   System.out.println( fun.apply("vinod"));
	   
	   BiFunction<String , String , Integer> bif = (str1 , str2) -> str1.length()- str2.length();
	  System.out.println( bif.apply("HelloWorld", "java"));
	    
	}
	
}