package com.file.handling;

import java.io.File;

public class A {
        public static void main(String[] args) {
			
        	//File Creation
        File f2 = new File("java.txt");         
        File f3 = new File("angularjs.txt");
        File f4 = new File("springboot.txt");
        File f5 = new File("prasoonbidua.txt");
        	
        //Folder Creation
        File fdr = new File("myfolder");
        fdr.mkdir();  
        
        File f6 = new File(fdr,"file1.txt");  
        File f7 = new File(fdr,"file2.txt");
        	
        	    try {
        	         
        	    	boolean fstatus = f2.createNewFile();
        	         f3.createNewFile();       
        	         f4.createNewFile();
        	         f5.createNewFile();
        	         f6.createNewFile();
        	         f7.createNewFile();
        	    
        	        System.out.println(fstatus);
        	         
        	    }
        	    
        	    catch(Exception e) {
        	    	   System.out.println(e);
        	    }
        	    
        }
        	    
   }
