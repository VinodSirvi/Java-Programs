package com.functional.interfac;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Consumer Interface 
// Abstract method -- > void accept(T t);

class ConsumerI implements Consumer<Integer>{
	
	public void accept(Integer i) {
		System.out.println(i);
	}
}

public class Consumer_Interface implements BiConsumer<Integer , Integer> {
	
	public void accept(Integer a , Integer b) {
		System.out.println(a+b);
	}
  public static void main(String[] args) {
	
	  // Consumer
	  Consumer<Integer> c = new ConsumerI();
	  c.accept(10);
	  
	  // BiConsumer
	  BiConsumer<Integer , Integer> bic = new Consumer_Interface();
	  bic.accept(10, 20);
	 
}
}
