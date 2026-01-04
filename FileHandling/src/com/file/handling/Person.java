package com.file.handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	  int id ;
	  String name;
	  String Email = "abc123@gmail.com";
	  transient int password = 1234;
	  
     public static void main(String[] args) throws Exception{
		Person p = new Person();
		p.id = 100;
		p.name = "Vinod";
		
		System.out.println("===============serialization process started========");
		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		
		System.out.println("===========serialization completed=========");
		
		System.out.println("====de-serialization started===============");
		
		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		
		Person p1 = (Person)object;
		
		System.out.println("id =>"+p1.id);
		System.out.println("name =>"+p1.name);
		System.out.println("email =>"+p1.Email);
		System.out.println("password =>"+p1.password);
		ois.close();
		System.out.println("================de - serialization complete==========");
		
		
		
	}
}
