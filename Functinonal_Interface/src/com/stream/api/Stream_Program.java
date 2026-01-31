package com.stream.api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_Program {
 public static void main(String[] args) {
	
	 ArrayList<Integer> numbers = new ArrayList<Integer>();
	 numbers.add(1);
	 numbers.add(2);
	 numbers.add(3);
	 numbers.add(4);
	 numbers.add(5);
	 
	  // Stream API
	    // stream()
	      Stream<Integer> streamNumbers = numbers.stream();
	  
	   // forEach ()  
	    streamNumbers.forEach(i -> System.out.println(i));
	    
	    // cannot iterate second time , it will throw illegalStateException
	    try {
	    streamNumbers.forEach(i -> System.out.println(i));
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	    
	    // filter() 
	    Predicate<Integer> p = val -> val%2==0 ;
	    numbers.stream().filter(p).forEach( ele -> System.out.println(ele));
	    
	    // map()
	    Function<Integer , Integer> f1 = a -> a*a; 
	    numbers.stream().filter(p).map(f1).forEach( i1 -> System.out.println(i1));
	    
	    
	    // print names that start with A
	    List<String> names = Arrays.asList("Vinod" , "Ajay" , "Arun" , "Rahul");
	    
	    names.stream().filter(i -> i.startsWith("A")).forEach( j -> System.out.println(j));
	    
	    // Print the name that not start with A
	    
	    names.stream().filter( i -> !i.startsWith("A") ).map( j -> j.toUpperCase()).forEach( k -> System.out.println(k));
	  
}
}








 


