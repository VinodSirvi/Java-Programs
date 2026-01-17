
//sum of digits of a given number

package com.vinod;

import java.util.Scanner;

public class B {
	
  public static void main(String[] args) {
	  
	  System.out.println("enter the number");
	  
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int sum =0;
	  while(num>0) {
		  
		  int d = num%10;
		   sum = sum+d;
		  num = num/10;
		  }
	System.out.println(sum);
	  
}

}
