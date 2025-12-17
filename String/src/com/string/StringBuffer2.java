package com.string;

public class StringBuffer2 {
      public static void main(String[] args) {
    	  
    	  // create a stringBuffer Object
		StringBuffer sb = new StringBuffer();
	 
	 // string buffer default size = 16 
		System.out.println(sb.capacity());
	
	// 16 value added 	
		sb.append("1234567890123456");
		
    // again capacity = 16 because value = 16		
		System.out.println(sb.capacity());
	
	// 1234 added means 16+4 = 20	
		sb.append("1");
	
	// now string buffer capacity = (current capacity *2)+2  => (16*2)+2 => 34	
		System.out.println(sb.capacity());
		
	// total character in string buffer object = 20	
		System.out.println(sb.length());
		
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());
		
	}     
}
