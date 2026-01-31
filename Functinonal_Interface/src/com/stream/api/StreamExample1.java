// functional interface and lambda expression , stream API , for each stream ,
// consumer , predicate , function , map , filter , mrthod reference , distinct 
// limit -- > jitni limit di utne hi access kar payega 
// skip --> jitne skip me elements diye utne skip karke baki use ukarega 
package com.stream.api;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
  public static void main(String[] args) {
	
	  List<Integer> list = new ArrayList<>();
	  list.add(10);
	  list.add(20);
	  list.add(33);
	  list.add(40);
	  
	  System.out.println(list);
	  
	  Stream<Integer> streamdata = list.stream();
	  Stream<Integer> sortedstream = streamdata.sorted();
	  System.out.println("=====================");
	  
	  sortedstream.forEach(i -> System.out.println(i));
	  System.out.println("=====================");
	  
	  list.stream().filter(i -> i%2 ==0).forEach(n -> System.out.println(n));
	  System.out.println("=====================");
	  
	  list.stream().filter(a -> a%2 == 0).map(i->i*i).forEach(n -> System.out.println(n));
	  System.out.println("=====================");
	  System.out.println(list);
	  
	  list.stream().limit(3).forEach( i -> System.out.println(i));
	  System.out.println("=============================");
	  list.stream().skip(2).forEach( i -> System.out.println(i));
}
}
