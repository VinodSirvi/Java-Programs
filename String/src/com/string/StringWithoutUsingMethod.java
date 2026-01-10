package com.string;

import java.util.Arrays;

// Removing Space in given String without using inbuilt method
public class StringWithoutUsingMethod {
   public static void main(String[] args) {
	String str = " The Classroom ";
	String empstr ="";
	
	// remove the space 
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		
		if(ch != ' ') {
			empstr = empstr + ch;
	
		}
	}
	
	   
	
	String str2 = " School Master ";
	String empstr2 ="";
	
	for(int i=0; i<str2.length(); i++) {
		char ch = str2.charAt(i);
		
		if(ch != ' ') {
			empstr2 = empstr2 + ch;
			
		}
	}
	
	// Changing the case of the string 
	
	 char arr1[] = empstr.toCharArray();
	 
	  for(int i=0; i<arr1.length; i++) {
		  
		  if(arr1[i] >= 'a' && arr1[i] <= 'z') {    
			  
			 arr1[i] = (char) (arr1[i] -32);
		  }
	  }
	  
	  empstr = new String(arr1);
	  
	  
	  char arr2[] = empstr2.toCharArray();
	  
		  for(int i=0; i<arr2.length; i++) {
			  
			  if(arr2[i] >= 'a' && arr2[i] <= 'z') {    
				  
				 arr2[i] = (char) (arr2[i] -32);
			  }
		  }
		  
		  empstr2 = new String(arr2);
		  
	  
	   
		  
	// Converting the string into array 
	  
	   char arr3[] = new char[empstr.length()];
	   
	   for(int i=0; i<arr3.length; i++) {
		   arr3[i] = empstr.charAt(i);
	   }
	   
       char arr4[] = new char[empstr2.length()];
	   
	   for(int i=0; i<arr4.length; i++) {
		   arr4[i] = empstr2.charAt(i);
	   }
	   
	   
    
	 // sorting 
	   
	   for (int i=0; i<arr3.length; i++) {
		   
		   for(int j=0; j<arr3.length-i-1; j++) {
			   
			   if(arr3[j] > arr3[j+1]) {
			   char c = arr3[j];
			   arr3[j] = arr3[j+1];
			   arr3[j+1] = c;
			   
			   }
		   }
	   }
	   
          for (int i=0; i<arr4.length; i++) {
		   
		   for(int j=0; j<arr4.length-i-1; j++) {
			   
			   if(arr4[j] > arr4[j+1]) {
			   char c = arr4[j];
			   arr4[j] = arr4[j+1];
			   arr4[j+1] = c;
			   
			   }
		   }
	   }
	  
	   
	   
	  if(Arrays.equals(arr3, arr4)) {
		  System.out.println("Anagram");
	  }
	  else System.out.println("not Anagram");
	   
	
}
   
  
}

