package com.array;

public class Program6 {
public static void main(String[] args) {
		
		int arr[] = {1,-2,-300,4,};
			
		int low = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] < low) {
				
				low = arr[i];
			}
			
		}
		
		System.out.println("low "+low);
				
		}
}
