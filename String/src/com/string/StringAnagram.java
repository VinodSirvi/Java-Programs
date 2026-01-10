package com.string;

import java.util.Arrays;

public class StringAnagram {
       public static void main(String[] args) {
		String str1 = "School Master";
		String str2 ="The Classroom";
		
		// replace 
		str1 = str1.replace(" ","");
		str2 = str2.replace(" ","");
		
		// change case 
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
       // change string into char array
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		// sort the array
		
	   Arrays.sort(arr1);
	   Arrays.sort(arr2);
	   
	   // compare the array
	   
	   if(Arrays.equals(arr1, arr2)) {
		   System.out.println("anagram");
	   }
	   else System.out.println("not anagram");
       }
}
