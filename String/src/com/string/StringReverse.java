package com.string;

public class StringReverse {
   public static void main(String[] args) {
	String sb = "hello";
	
	String str = "";
	for(int i=sb.length()-1; i>=0; i--) {
	char ch = sb.charAt(i);
	str = str + ch;
	}
	
	System.out.println(str);
}
}
