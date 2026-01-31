package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
   public static void main(String[] args) {
	
	   List<Integer> list = new ArrayList<>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(25);
	   list.add(33);
	   list.add(99);
	   list.add(-100);
	   
	   List<String> list1 = new ArrayList<>();
	   list1.add("ajay");
	   list1.add("rahul");
	   list1.add("rohit");
	   list1.add("rakesh");
	   list1.add("rohan");
	   list1.add("vinod");
	   list1.add("ramesh");
	   list1.add("");
	   
	   
	   
	   // list elements priting 
	   list.stream().forEach(i -> System.out.println(i));
	   
	   System.out.println("");
	   //even number
	   list.stream().filter(i -> i%2 ==0).forEach(n -> System.out.println(n));
	   System.out.println("");
	   // odd number
	   list.stream().filter(i -> i%2 !=0).forEach(n -> System.out.println(n));
	   System.out.println("");
	   //upper case
	   list1.stream().map(i -> i.toUpperCase()).forEach(n -> System.out.println(n));
	   System.out.println("");
	   // empty string 
	   list1.stream().filter(i -> i != null).forEach(n -> System.out.println(n));
	   System.out.println("");
	   //list sum 
	   int sumof = list.stream().mapToInt(Integer::intValue).sum();
	   System.out.println(sumof);
	   System.out.println("");
	   // list avg
	   double avgof = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
	   System.out.println(avgof);
	   System.out.println("");
	   // count list elements 
	   double countof =list.stream().mapToInt(Integer::intValue).average().getAsDouble();
	   System.out.println(countof);
	   System.out.println("");
	   // distinct elements 
	   list.stream().distinct().forEach(n -> System.out.println(n));
	   System.out.println("");
	   //sorted order 
	   list.stream().sorted().forEach(n -> System.out.println(n));
	   System.out.println("");
	   
	   
	   // question 1
	   list.stream().filter(i -> i>10).forEach(n -> System.out.println(n));
	   System.out.println("");
	   // question 2
	   list.stream().map(i -> i*i).forEach(square -> System.out.println(square));
	   System.out.println(""); 
	   // question 3 
	   list1.stream().filter(i -> i.length()>5).forEach(n -> System.out.println(n));
	   System.out.println("");
	   // question 4
	   list1.stream().filter(i -> i.startsWith("a")).forEach(n -> System.out.println(n));
	   System.out.println("");
	   // question 5
	   list.stream().filter(i -> i > 0).forEach(n -> System.out.println(n));
	   System.out.println("");
	   
	   // question 6 
	   
	   List<Integer> salary = Arrays.asList(55000,60000 , 50000 , 730000);
	   System.out.println("salary greater then 50000");
	   salary.stream().filter(i -> i>=50000).forEach(n ->System.out.println(n));

	   // question 7
       // product list me se price < 1000 wale products
	   
	   List<Integer> Productprice = Arrays.asList(2000 , 1500 , 1000 , 2300 ,950 , 800);
	   System.out.println(" product price greater then 1000");
	   salary.stream().filter(i -> i>=1000).forEach(n ->System.out.println(n));   
       
	   
	   // question 8
	   // String list ko length ke basis par map karo
	   list1.stream().map(i -> i.length()*5).forEach(n -> System.out.println(n));
	   System.out.println("");
	   
	   // question 9
	   //Integer list ke double value generate karo 
	   List<Integer> IntList = Arrays.asList(10 , 20 , 30 ,40 , 50);
	   List<Double> DoubleList = IntList.stream().map(i -> i*2.0).toList();
	   DoubleList.stream().forEach(i -> System.out.println(i));
	   
	   // question 10 
	   // list ke elements par custom calculation lagao
	   list.stream().map(x -> (x * 2) + 5).forEach(n -> System.out.println(n));
	   System.out.println("");
}
}
