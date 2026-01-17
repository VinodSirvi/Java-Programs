package com.collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program1 {
	public static void main(String[] args) {

		// Converting Array to Collection 
		String [] arr = { "Springboot" , "java" , "javascript"};
		
		List<String> list1 = Arrays.asList(arr);
		System.out.println("List :" + list1);
		
		// the array is converted into collection but there is one problem  
		// you cannot add or remove elements from the list 
		
		// to add or remove elements from the list you need to use arraylist
		
		List<String> list2 = new ArrayList<>(Arrays.asList(arr));
		 list2.add("Vinod");
		 list2.remove(1);
		 System.out.println("List2 :" + list2);
		 
		 
		 // Collection to Array 
		 
		  String [] arr2 = list2.toArray(new String[0]);   
		  for(String ele : arr2) {
			  System.out.println(ele);
		  }
		 
		  
		 // Hash Map (Converting to Array )
		  
		  HashSet<String> set1 = new HashSet<>();
		  set1.add("A");
		  set1.add("B");
		  set1.add("C");
		  set1.add("D");
		  
		   String arr3[] = set1.toArray(new String[0]);
		     
		  for(String ele1 : set1) {
			  System.out.println("Set1 :" + ele1);
		  }
		
	}
}













