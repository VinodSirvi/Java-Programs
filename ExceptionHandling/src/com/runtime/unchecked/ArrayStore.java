package com.runtime.unchecked;

public class ArrayStore {
  public static void main(String[] args) {
	Object [] arr = new String[5];
        
	try {
	arr[0] = new Integer(10);
	}
	
	catch(ArrayStoreException e) {
		System.out.println(e);
	}
	
}
}
