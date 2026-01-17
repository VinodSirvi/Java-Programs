package com.exception.handling;

public class D {
  public static void main(String[] args) {
	  try {
		    // forName is the method  of Class , it checks for class is available or not  
		 Class.forName("com.mysql.jdbc.Driver");
		} 
	  
	  catch (Exception e) {
		    System.out.println(e);
		}

}
}
