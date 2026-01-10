package com.array.practice;

import java.util.Scanner;

public class ArrayPractice2 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the size of array");
	   int n = sc.nextInt();
	   int arr[] = new int[n];
	   System.out.println("enter array elements");
	   for(int i=0; i<n; i++) {
		   arr[i] = sc.nextInt();
	   }
	  System.out.println("=========================");
	  System.out.println("printing array elements");
	  // 1. print all array elements 
	   for(int i=0; i<arr.length; i++) {
		   System.out.println(arr[i]);
	   }
	   
	  System.out.println("========================="); 
	  System.out.println("sum of array elements");
	   // 2 . sum of all array elements
	   int sum =0;
	   for(int i=0; i<n; i++) {
		   sum += arr[i];
	   }
	   System.out.println(sum);
	 
	  System.out.println("========================");
	   System.out.println("average of array elements");
	   //3. find the average of elements
	  int add =0;
	  for(int i=0; i<n; i++) {
		  add += arr[i];
	  }
	 double avg = (double)sum/arr.length;
	 System.out.println(avg);
	 
	 System.out.println("=======================");
	  System.out.println("max element in array ");
	 // finding max element in array 
	 int max = arr[0];
	 for(int i=1; i<arr.length; i++) {
		 if(arr[i]> max) {
			 max = arr[i];
		 }
	 }
      System.out.println(max);
     System.out.println("=======================");
     System.out.println("minimum element of array");
     
     int min = arr[0];
     for(int i=1; i<arr.length; i++) {
    	 if(arr[i]< min) {
    		 min = arr[i];
    	 }
     }
    System.out.println(min);  
    System.out.println("==========================");
    System.out.println("print array in reverse order");
    
    for( int i = arr.length-1; i>=0; i--) {
    	System.out.println(arr[i]);
    }
    
    System.out.println("===========================");
    System.out.println("two pointer approach to reverse array");
    
    int start = 0;
    int end = arr.length-1;
    
    while(start < end) {
    	
    	int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp ;
    	start++;
    	end--;
    	
    }
    
    for(int val : arr) {
    	System.out.println(val);
    }
    System.out.println("============================");
    System.out.println("copy one array element to another");
    
    int copy[] = new int [arr.length];
    
    for(int i=0; i<copy.length; i++) {
    	copy[i] = arr[i];
    	 System.out.println(copy[i]);
    }
    System.out.println("=============================");
    
   

}
}
