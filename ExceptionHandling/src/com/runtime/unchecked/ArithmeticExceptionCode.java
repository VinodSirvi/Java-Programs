package com.runtime.unchecked;

public class ArithmeticExceptionCode {
    public static void main(String[] args) {
	    
    	 //  Exception code 
   // 	int i  = 10 /0;
    	
    	try {
    		int i  = 10 /0;	
    	}
    	
    	catch(ArithmeticException e) {
    		System.out.println(e);
    	}
  
    
  }
}
