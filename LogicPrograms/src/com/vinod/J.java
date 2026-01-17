

// special two digit or not 
//  any two digit number is equal to its  ==> (1+2) + (1*2)
// 12 == > 5 // not special 

package com.vinod;
import java.util.Scanner;
public class J {
public static void main(String[] args) {
	
	
	
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int temp = num;
	int sum = 0;
	int mul = 1;
	while(num!=0) {
		int d = num%10;
		sum = sum+d;
		mul = mul*d;
		num = num/10;
	}
	
	int solution = sum + mul;
	
	if(temp == solution) {
		System.out.println("special two digit number");
		
	}
	
	else System.out.println("not special");
}

}
