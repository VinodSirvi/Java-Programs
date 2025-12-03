package com.oops;

public class Encapsulation {

	private int id;
	private String name;
	
	public void SetInstanceVariable(int id , String name) {
		
		this.id=id;
		this.name = name;
		
	}
	
	public int GetInstanceid() {
		
		return id;
		}
	
	public String GetInstanceName() {
		
		return name;
	}
	
	public static void main(String[] args) {
		
		Encapsulation e1 = new Encapsulation();
		
		e1.SetInstanceVariable(101,"vinod");
		System.out.println(e1.GetInstanceid());
		System.out.println(e1.GetInstanceName());
	}
}


