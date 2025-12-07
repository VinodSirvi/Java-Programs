//2d array program

package com.array;

public class program1 {

	public static void main(String[] args) {
		
		int arr[][] = {
				
				{10,20,30,40},
				{34,54,34,67},
				{25,72,65,32},
				{13,75,32,22}
		};
		
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j<arr[0].length; j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			
			System.out.println();
		}
	}
}
