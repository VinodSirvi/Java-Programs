
// (gcd/hcf) greatest common divisor 
//  two number is divide comeletely by its largest positive number

package com.vinod;
import java.util.Scanner;
public class K {
public static void main(String[] args) {
	System.out.println("enter num1 and num2");
	Scanner sc = new Scanner(System.in);
	
	int num1 , num2, num3 = 0, i ;
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	 
	 for(i=1; num1>=i && num2>=i; i++) {
		 
		 if(num1%i == 0 && num2%i == 0) {
			 
			 num3 = i;
		 }
		 
		 
	 }
	 
	 System.out.println("GCD= "+num3);
	
}
}
