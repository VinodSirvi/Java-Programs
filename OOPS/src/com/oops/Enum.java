// Enum 
package com.oops;

enum COURSE {
	
	JAVA , HTML , CSS , SQL ;
}

class Driver {
	
	enum WEEKDAYS {
		
		SUNDAY , MONDAY , TUESDAY , WEDNESDAY;
	}
	
}

public class Enum {
	
    public static void main(String[] args) {
		   
    	          // enum out of class 
    	           COURSE[]data = COURSE.values();
    	           
    	           for( COURSE val : data) {
    	        	         
    	        	   System.out.println(val);
    	           }
    	           
    	           // enum in parent class
    	           Driver.WEEKDAYS day = Driver.WEEKDAYS.SUNDAY;
    	           System.out.println(day);
    	          
    	            	
	}

}
