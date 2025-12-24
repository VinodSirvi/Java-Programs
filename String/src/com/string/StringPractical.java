package com.string;

public class StringPractical {
public static void main(String[] args) {
	
	// String Literals
	String s1 = "java";
	String s2 = "java";
	String s3 = "java";
	
	System.out.println(s1==s2);               // true
	System.out.println(s2==s3);                // true  
	
	System.out.println(s1.equals(s2));         // true
	System.out.println(s2.equals(s3));         // true
	
	System.out.println("====================");
	
	// String Using new Keyword
	String s4  = new String("Hello");                 
	String s5 = new String("Hello");
	String s6 = new String("Hello");
	
	System.out.println(s4==s5);              // false 
	System.out.println(s5==s6);              //false
	
	System.out.println(s4.equals(s5));       // true        // true because .equals method
	                                                        // override hua 
	System.out.println(s5.equals(s6));       // true 
	System.out.println("======================");
	
	// String Buffer
	StringBuffer sb1 = new StringBuffer("World");   
	StringBuffer sb2 = new StringBuffer("world");
	StringBuffer sb3 = new StringBuffer("world");
	
	System.out.println(sb1==sb2);          // false 
	System.out.println(sb2==sb3);          // false 
	
	System.out.println(sb1.equals(sb2));    // false    // false becuase .equals method
	System.out.println(sb2.equals(sb3));    // false    // override nhi hua ( defalult me
	                                                   // object ka reference check karta
	System.out.println("=======================");
	
	// String Builder 
	StringBuilder sb4 = new StringBuilder("Win");
	StringBuilder sb5 = new StringBuilder("Win");
	StringBuilder sb6 = new StringBuilder("Win");
	
	System.out.println(sb4==sb5);        // false 
	System.out.println(sb5==sb6);        // false 
	 
	System.out.println(sb4.equals(sb5)); // false    // false becuase .equals method
	System.out.println(sb5.equals(sb6)); // false    // override nhi hua ( defalult me
	                                                // object ka reference check karta
	
	String s = "java";
    s = s+"programing";    // variable = variable + literal 
    System.out.println(s);
    
    String sn = "java" + "programming"; // x = a+b;
    System.out.println(sn);
    
    String sn1 = new String("Good");
    sn1 = sn1+"job";
    System.out.println(sn1);
    
    String sn2 = new String("hi") + "hello";
    System.out.println(sn2);
    
    StringBuffer sbuf = new StringBuffer("JJJ");
    //  sbuf= sbuf + "KKK";  (not allowed)
    
    StringBuilder sbul = new StringBuilder("DDD") ;
   // sbul = sbul +"fff";   (not allowed )
    
    
    
    
}
}
