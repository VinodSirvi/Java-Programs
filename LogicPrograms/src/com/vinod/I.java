
// prime number or not

package com.vinod;
import java.util.Scanner;
public class I {
public static void main(String[] args) {
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i = 1;
	int count = 0;
	while(num>=i) {
		if(num%i == 0) {
			
			count++;
		}
		
		i++;
	}
	
	if(count ==2) {
		System.out.println("prime number");
	}
	
	else System.out.println("not prime");
}
}
