package com.runtime.unchecked;

public class NumberFormat {
   public static void main(String[] args) {
	String str = "abc";
	
	try {
	 int i = Integer.parseInt(str);
	}
	
	catch(NumberFormatException e) {
		System.out.println(e);
	}
}
}
