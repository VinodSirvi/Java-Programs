package com.oops;


 class Student {
	
	int id;
	String name;
	
	public void SetA(int id , String name) {
		
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		
		return "Student[id="+id+"name="+name+"]";
	}
	
	
	
}

public class OverridingToString {
  
	public static void main(String[] args) {
		Student s1 = new Student();
		
   OverridingToString s2 = new OverridingToString();
   s1.SetA(101,"vinod");
   System.out.println(s1);
   System.out.println(s1.toString());
   
   
   
   
   
		
		
	}
}
