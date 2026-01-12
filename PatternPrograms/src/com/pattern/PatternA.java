package com.pattern;

public class PatternA {
public static void main(String[] args) {
    int n =5;
	int m = 5;
	for(int i =0; i<n; i++) {
		
		for(int j =0; j<m; j++) {
			
			
		    if( (i==0 && j>0 ) || (j==0 && i!=0 ) || (j==m && i!=0) || (i==(n-1)/2 )  ) {
				System.out.print(" *");
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
}
}