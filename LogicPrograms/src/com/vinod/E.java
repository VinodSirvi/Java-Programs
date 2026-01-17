
// calculate number of digits of a given number

package com.vinod;
import java.util.Scanner;
public class E {
   public static void main(String[] args) {
	System.out.println("enter th number");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int sum = 0;
	while(num>0) {
		sum = sum+1;
		num = num/10;
		
	}
	
	System.out.println("count = "+sum);
}
}
