
// reverse array using for loop

package com.array;

public class Program5 {

	public static void main(String[] args) {
		
		int arr[] = { 1,2,3,4,5};
		
		System.out.println("======array elements=========");
		
		for( int ele : arr) {
			
			System.out.println(ele);
		}
		
		int n = arr.length;
		
		for(int i =0; i<n/2; i++ ) {
			
			int temp = arr[i];
			
			arr[i] = arr[n-1-i];
			
			arr[n-1-i] = temp;
			
		}
		
		System.out.println("=========reverse array========");
		
		for(int ele : arr) {
			System.out.println(ele);
		}
	}
}
