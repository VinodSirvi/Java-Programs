package com.string;

import java.util.Arrays;

public class StringPalindrome {
  public static void main(String[] args) {
	String sb = "madam";
	String sb2 =sb ;
	
	char arr[] = sb.toCharArray();
	char arr2[] = sb2.toCharArray();
	
	int start = 0;
	int end = arr.length-1;
	
	for(int i=0; i<arr.length/2; i++) {
		
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	
		start++;
		end--;
		
	}

	if(Arrays.equals(arr, arr2 )) {
		System.out.println("palindrome");
	}
	else System.out.println("not  palindrome");
		
}
}
