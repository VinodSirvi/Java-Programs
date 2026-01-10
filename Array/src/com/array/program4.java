package com.array;

public class program4 {

	public static void main(String[] args) {
		
		int arr[] = {10 , 20 , 30 ,40 ,50};
		
		int i = 0;
		
		int j = arr.length-1;
		
	
		
		System.out.println("printing array elements");
		
		for ( int ele : arr) {
			System.out.println(ele);
		}
		
		while(i<j) {
			
			int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 
			 i++;
			 j--;
			 
			 }
		
        System.out.println("printing array elements");
		
		for ( int ele : arr) {
			System.out.println(ele);
		}
		
	}
}
