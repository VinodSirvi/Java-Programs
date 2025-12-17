package com.string;

// Removing Space in given String without using inbuilt method
public class StringWithoutUsingMethod {
   public static void main(String[] args) {
	String str = " vinod sirvi java ";
	String emptyString ="";
	
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		
		if(ch != ' ') {
			emptyString = emptyString + ch;
			// for string builder 
			// sb.append(ch);
		}
	}
	
	System.out.println(emptyString);
	
}
}

