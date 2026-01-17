
// sum of prime digits in a given number

package com.vinod;
import java.util.Scanner;
public class D {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int sum =0;
	
	while(num>0) {
		
		int d = num%10;
		
		if(d==2 || d==3 || d==5 || d==7) {
			
			sum = sum+d;
		}
		
		num = num/10;
		}
	System.out.println(sum);
}
}
