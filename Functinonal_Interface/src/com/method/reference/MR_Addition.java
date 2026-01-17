package com.method.reference;

interface I {
	public int add(int a , int y);
}

class addition {
	public static int sum(int x , int y) {
		return x+y;
	}
}
public class MR_Addition {
   public static void main(String[] args) {
	
	      I i1 = addition::sum;
	      System.out.println(i1.add(15,10));
}
}
