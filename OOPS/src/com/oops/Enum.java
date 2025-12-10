// Enum 
package com.oops;

enum COURSE {
	
	JAVA , HTML , CSS , SQL ;
}

class driver {
	
	enum WEEKDAYS {
		
		SUNDAY , MONDAY , TUESDAY , WEDNESDAY;
	}
	
}

public class Enum {
	
    public static void main(String[] args) {
		   
    	           driver d1 = new driver();
    	           COURSE[]data = COURSE.values();
    	           
    	           for( COURSE val : data) {
    	        	         
    	        	   System.out.println(val);
    	           }
    	           
    	           
    	           
    	
	}

}
