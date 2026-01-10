package com.file.handling;

import java.io.File;
// File Handling
public class C {
  public static void main(String[] args) throws Exception{
	  
	// folder Creation   
	File folder = new File("FileHandlingFolder");
	folder.mkdir();
	
	// file Creation 
	File f1 = new File(folder , "file1.txt");
	File f2 = new File(folder , "file2.txt");
	File f3 = new File(folder , "file3.txt");
	File f4 = new File(folder , "file4.txt");
	File f5 = new File(folder , "file5.txt");
	
	f1.createNewFile();
	f2.createNewFile();
	f3.createNewFile();
	f4.createNewFile();
    
	// to check the file is created or not 
	boolean fileStatus = f5.createNewFile();
	System.out.println(fileStatus);
	
	// Display files of folder
	String arr[] = folder.list();
	 
	 for ( String ele : arr) {
		 System.out.println(ele);
	 }
	 
	 System.out.println("======================");
	 
	 // using path 
	 File path = new File("C:\\Users\\vinod\\eclipse-workspace\\FileHandling\\FileHandlingFolder");
	 String arr1[] = path.list();
	 for(String val : arr1) {
		 System.out.println(val);
		 
	 }
  }
}
