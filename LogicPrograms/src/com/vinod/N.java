package com.vinod;
import java.util.Scanner;
public class N {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num>0) {
			
			int digit = num%10;
			sum = sum +(digit*digit*digit);
			num = num/10;
			
		}
		
		if(sum ==temp) System.out.println("Armstrong number");
		else System.out.println("not armstrong");
	}
	

}
