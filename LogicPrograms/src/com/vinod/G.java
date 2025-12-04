
//palindrome or not  

package com.vinod;
import java.util.Scanner;
public class G {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	int temp = num;
	int rev = 0;
	while(num>0) {
		int d = num%10;
		rev = rev*10+d;
		num = num/10;
		}
	if(rev == temp) {
		
		System.out.println("palindrome");
	}
	
	else System.out.println("not palindrome");
}
}
