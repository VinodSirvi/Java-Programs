package com.runtime.unchecked;

public class NullPointer {
	
	int i = 10;
	
 public static void main(String[] args) {
	 
	NullPointer np = null;
	
	try {
	System.out.println(np.i);
	}
	
	catch(NullPointerException e) {
		System.out.println(e);
	}
}
}
