
// find the number of occurrences of the digit in the number n

package com.vinod;
import java.util.Scanner;
public class H {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	System.out.println("enter the digit you want to check how many times its repeating");
	Scanner sc1 = new Scanner(System.in);
	int key = sc.nextInt();
	int count =0;
	while(num!=0) {
		int d = num%10;
		if (d==key) {
			
			count = count +1;
			
		}
		num = num/10;
	}
	System.out.println("repeating count of given number= "+count);
}
}
