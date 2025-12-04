//finding biggest element in array

package com.array;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		System.out.println("enter the size of array");
		
		n = sc.nextInt();
		
       int arr[] = new int[n];
		
       System.out.println("enter array elements");
       for(int i=0; i<arr.length; i++) {
    	   
    	   arr[i] = sc.nextInt();
       }
       
       int max = arr[0];
       
       for(int i=0 ; i<arr.length; i++) {
    	   
//    	   if(arr[i] > max) {
//    		   
//    		   max = arr[i];
    	   
    	   max = Math.max(max, arr[i]);
    	   
       }
       
       System.out.println("biggest element in array:"+max);
	}
}
