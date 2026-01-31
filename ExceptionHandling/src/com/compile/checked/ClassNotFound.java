package com.compile.checked;

public class ClassNotFound {
   public static void main(String[] args) {
	
	     try {
	    // class not found Exception 
	   Class.forName("com.mysql.cj.jdbc.Driver");
	     }
	     
	     catch(ClassNotFoundException e) {
	    	  System.out.println(e);
	     }
	     
	     try {
	     
	   Class.forName("com.exception.handling.A");
	   
	     }
	     
	    catch(ClassNotFoundException e){
	    	  System.out.println(e);
	     }
	     
	     
	     
}
}