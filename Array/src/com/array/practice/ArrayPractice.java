package com.array.practice;

import java.util.Scanner;

public class ArrayPractice {
   public static void main(String[] args) {
	
	 // declaring an array
	   
	   //type 1 
	   int arr[] = new int[5];
	   
	   // type 2
	   int arr2[] = {1,2,3,4,5};
	   
	// adding elements to type 1
	   
	   arr[0] = 10;
	   arr[1] = 20;
	   arr[2] = 30;
	   arr[3] = 40;
	   
	// initialize array ( user input)
	   Scanner sc = new Scanner(System.in);
	   
	   // array size ( user input)
	   System.out.println("enter array size:");
	   int arr3 [] = new int[sc.nextInt()];
	  
	   
	   System.out.println("enter element in array");
	   for(int i=0; i<arr3.length; i++) {
		   arr3[i] = sc.nextInt();
	   }
	   
    // 1. print all the elements of an array 
	   
	   // array 1 
	  for(int i=0; i<arr.length; i++) { 
		  System.out.println(arr[i]);
	  }
	  
	  // array 2 
	  for(int i=0; i<=arr2.length-1; i++) {
		  System.out.println(arr2[i]);
	  }
	  
	  // array 3
	  for(int i=0; i<arr3.length; i++) {
		  System.out.println(arr3[i]);
	  }
	  
	 
	  // using for each loop to print elements 
	  for( int val : arr3) {
		  System.out.println(val);
	  }
	  
	    	 
}
}
