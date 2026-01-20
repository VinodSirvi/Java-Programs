package com.functional.interfac;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_Lambda {
    public static void main(String[] args) {
		
    	// Consumer
    	Consumer<Integer> c = a -> System.out.println(a);
    	c.accept(10);
    	
    	// Bi Consumer
    	BiConsumer<Integer , Integer> bic = (x ,y) -> System.out.println(x+y);
    	bic.accept(10, 20);
	}
}
