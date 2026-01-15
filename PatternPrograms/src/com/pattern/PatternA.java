package com.pattern;

public class PatternA {
public static void main(String[] args) {
    int n =19;

	for(int i =0; i<=n-1; i++) {
		
		// whole diagram 
		for(int j =0; j<=n-1; j++) {
			if( i+j==(n-1) || i==j || i==0 || i==n-1 || j==n-1 
			   || j==0 || i+j==(n-1)/2||j-i==(n-1)/2||i-j==(n-1)/2
			   ||i+j==(n-1)+(n-1)/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		
		}
		
		// Diamond outline 
		for(int j =0; j<=n-1; j++) {
			if(i+j==(n-1)/2||j-i==(n-1)/2||i-j==(n-1)/2
				||i+j==(n-1)+(n-1)/2)  {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}

	      
		//  top left 
		
	     for(int j =0; j<=n-1; j++) {
				if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j <=(n-1)/2  ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

	        // top right 
		       for(int j =0; j<=n-1; j++) {
					if(i==0 && j>=(n-1)/2 ||  j==(n-1) && i<=(n-1)/2 || j-i>=(n-1)/2  ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			    
		       
		    // bottom left 
			       for(int j =0; j<=n-1; j++) {
						if(i>=(n-1)/2 && j==0 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2  ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				      
              // bottom right 
			       for(int j =0; j<=n-1; j++) {
						if(i==(n-1) && j>=(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
	    
		            // empty diamond in box
		         for(int j =0; j<=n-1; j++) {
						if( i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j <=(n-1)/2 
						   || i==0 && j>=(n-1)/2 ||  j==(n-1) && i<=(n-1)/2 || j-i>=(n-1)/2  
						   || i>=(n-1)/2 && j==0 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2
						   || i==(n-1) && j>=(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
		         
		         // filled diamond 
		         for(int j =0; j<=n-1; j++) {
		 			if(i + j >= (n - 1) /2 && i + j <= (n - 1) + (n - 1) /2
		 			  && i - j <= (n - 1) /2 && j - i <= (n - 1) /2)  {
		 				System.out.print("*");
		 			}
		 			else {
		 				System.out.print(" ");
		 			}
		 		}
		         
		          System.out.println();
	}
}
}