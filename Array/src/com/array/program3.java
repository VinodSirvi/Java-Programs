// finding second largest and so on in an array

package com.array;

public class program3 {
   public static void main(String[] args) {
	
	   int arr[] = {1,34,21,6,4};
	   
	   int max = arr[0];
	   int second = arr[0];
	   for(int i =0; i<arr.length; i++) {
		   
		   if(arr[i] > max) {
			 
			   max = arr[i];
		   } 
		   
		   else   if(arr[i] > second && second < max) {
			  
			   second = arr[i];
		   }
		   
	   }
	   
	   
	   System.out.println("largest:-"+max +" second:-"+second);
}
}
