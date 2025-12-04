
// 

package com.vinod;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num>0) {
			
			int d = num%10;
			System.out.println(d);
			num = num/10;
		}
	}

}
