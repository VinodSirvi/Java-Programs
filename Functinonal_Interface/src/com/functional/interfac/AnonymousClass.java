package com.functional.interfac;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class AnonymousClass {
   public static void main(String[] args) {
	
	   // anonymous inner class predicate method implementation 
	   
	   Predicate<Integer> p1 = new Predicate<>() {
		   
		   public boolean test(Integer i) {
			   
			   if(i%2==0) {
				   return true;
			   }
			   else return false;
		   }
	   };
	   
	  System.out.println( p1.test(10));
	   
	  // anonymous inner class biPredicate method implementation 
	  
	  BiPredicate<Integer , Integer> bpi = new BiPredicate<>() {
		  public boolean test(Integer a , Integer b) {
			  if(a%b==0) {
				  return true ;
			  }
			  else return false ;
		  }
	  };
	   
	System.out.println( bpi.test(20, 10));
	   
	
	 Consumer<Integer> c = new Consumer<>() {
		
		 public void accept(Integer c) {
			  if(c%2==0) {
				  System.out.println("even number");
			  }
			  
			  else System.out.println("odd number");
		 }
	 };
	 
	c.accept(20);
	 
	 BiConsumer<Integer , Integer> bic = new BiConsumer<>() {
		 
		 public void accept(Integer c1 , Integer c2) {
			 
			 if(c1+c2 >= 50) {
				 System.out.println("pass");
			 }
			 else System.out.println("fail");
		 }
	 };
	 
	 bic.accept(20, 30);
	 
	 
	 Function<String , Integer> f = new Function<>() {
		 public Integer apply(String s) {
		    return s.length();
		 }
	 };
	 
	System.out.println( f.apply("hello"));
	
	BiFunction<String , String , Integer> bif = new BiFunction<>() {
		public Integer apply(String a1 , String a2) {
			return a1.length() + a2.length();
		}
	};
	System.out.println(bif.apply("vinod", "sirvi"));
	
	
	
	
}
}
