package com.vinod;
import java.util.Scanner;
public class M {
public static void main(String[] args) {
	
	System.out.println("enter n number");
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int num1 = 0, num2=1 , num3 = 0;
	
	System.out.print("fibonacci series = " +num1+","+num2);
	
	for(int i =2; i<n; i++ ) {
		
		num3 = num1+num2;
		System.out.print("," +num3);
		num1 = num2;
		num2 = num3;
		
	}
	
}
}
