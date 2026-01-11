package com.string;

public class StringMethods {
public static void main(String[] args) {
	String s = "Vinod";
	String s2 = " Vinod Sirvi Java";
	
	// convernting Numaric String to integer values and add 
		String add1 = "123";
		String add2 = "12345";
		
		Integer i1 = Integer.valueOf(add1);
		Integer i2 = Integer.valueOf(add2);
		int c = i1+i2;
		System.out.println(c);
		//==============================================================
		
		// converting Integer values to Numaric String 
		Integer i3 = 100;
		Integer i4 = 200;
		
		String stradd = String.valueOf(i3);
		String stradd2 = String.valueOf(i4);
	    String stradd3 = stradd + stradd2;
	    System.out.println(stradd3);
		//=============================================================
	// charAt()
	System.out.println(s.charAt(0));
	
	// concat()
	System.out.println(s.concat(" Sirvi"));
	
	//length()
	System.out.println(s.length());
	
	//startWith()
	System.out.println(s.startsWith("V"));
	
	//endWith()
	System.out.println(s.endsWith("d"));
	
	//contains()6tcfrr65r
	System.out.println(s.contains("no"));
	
	//Replace()
	System.out.println(s2.replace(" ",""));
	
	//ReplaceAll()
	System.out.println(s2.replaceAll("i","c"));
	
	//toUpperCase()
	System.out.println(s2.toUpperCase());
	
	//toLowerCase()
	System.out.println(s2.toLowerCase());
	
	//
	
	
	
	// intern();
	String str1 = "hello";
	String str2 = "hello";
	String str3 = new String("hello");
	
	System.out.println(str1==str2);
	System.out.println(str1==str3);
	
	str3= str3.intern();
	System.out.println(str1==str3);
	
	
	// split();
	
	String str4 = "Vinod Sirvi Java A3";
	  String str5[] = str4.split("\\s");
	  
	  for(String ele:str5) {
		  System.out.println(ele);
	  }
}
}
