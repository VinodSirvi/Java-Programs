package com.oops;

public class ThisKey {
		
		String name;
		int age;
		
	    ThisKey(String name,int age){
			this.name = name;
			this.age = age;
			System.out.println("constructor is called");
			
		}
		
		 void display() {
				System.out.println("name="+name+" age="+age);
			}
	   
		public static void main(String[] args) {
			
			ThisKey p1 = new ThisKey("vinod" , 18);
		    p1.display(); 
		}
	}

