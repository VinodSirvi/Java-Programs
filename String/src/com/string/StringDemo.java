package com.string;

public class StringDemo {
   public static void main(String[] args) {
	
	   // String LiteraL
	   String s1 = "Java";
	   String s2 ="Java";
	   
	   // check if the reference are same 
	   System.out.println(s1==s2);
	   // check if the content is same 
	   System.out.println(s1.equals(s2));
	   
	   
	   // String Using New Keyword
	   String s3 = new String("Hello");
	   String s4 = new String("Hello");
	   
	   System.out.println(s3==s4);
	   System.out.println(s3.equals(s4));
	   
	   // StringBuffer 
	   StringBuffer sb1 = new StringBuffer("Java");
	    sb1 = sb1.append("A3");
	   // default capicity 
	    System.out.println( sb1.capacity());
	    sb1.append("123456789012345");
	    System.out.println(sb1.capacity());
	   
	   // StringBuilder 
	   StringBuilder strsb1 = new StringBuilder("Java");
	   strsb1 = strsb1.append("A4");
	   System.out.println( strsb1.capacity());
	   
	// convernting Numaric String to integer values and add 
			String add1 = "123";
			String add2 = "12345";
			
			Integer i1 = Integer.valueOf(add1);
			Integer i2 = Integer.valueOf(add2);
			int c = i1+i2;
			System.out.println(c);
			
			
			// converting Integer values to Numaric String 
			Integer i3 = 100;
			Integer i4 = 200;
			
			String stradd = String.valueOf(i3);
			String stradd2 = String.valueOf(i4);
		    String stradd3 = stradd + stradd2;
		    System.out.println(stradd3);
			
		    
     // string methods 
		    
		  
	   
	   
	   
}
}
