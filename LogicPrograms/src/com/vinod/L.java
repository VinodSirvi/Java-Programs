package com.vinod;
import java.util.Scanner;
public class L {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int a = num%10;
	int b = (num/10)%10;
	int c = (num/100)%10;
	
	System.out.println("sum of last three digits = "+(a+b+c));
}
}
