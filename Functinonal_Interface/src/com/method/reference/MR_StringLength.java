package com.method.reference;

interface I2 {
	public int StringLength(String s);
}

class Length {
	public static int lengthCount(String s1) {
		return s1.length();
	}
}
public class MR_StringLength {
 public static void main(String[] args) {
	 
	 I2 i2 = Length::lengthCount ;
	 System.out.println(i2.StringLength("vinod"));
}
}
