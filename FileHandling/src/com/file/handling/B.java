package com.file.handling;

import java.io.File;

public class B {
        public static void main(String[] args) throws Exception{
		  
        	// for displaying particular folder files 
        	File f = new File("C:\\Users\\vinod\\eclipse-workspace\\FileHandling\\myfolder");
        	
        String arr[]  = f.list();
        	
        
        	for(String ele : arr) {
        		
        	File f1 = new File(f , ele);
        	
        	if(f1.isFile()) {
        		System.out.println(ele);
        	}
        		
        
        	}
        	
		}
}
