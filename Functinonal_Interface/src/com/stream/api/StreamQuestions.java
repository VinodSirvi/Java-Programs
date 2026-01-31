package com.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamQuestions {
   public static void main(String[] args) {
	
	   List<Integer> list = Arrays.asList(20,10,30,40,50,60,20,30,10);
	   
	   // 1. find maximum in a list 
	   int max = list.stream().mapToInt(x -> (int) x).max().getAsInt();
	   System.out.println(max);
	   
	   System.out.println("============");
	   
	   // 2. find minimum in a list 
	   int min = list.stream().mapToInt(x -> x.intValue()).min().getAsInt();
	   System.out.println(min);
	   
	   System.out.println("============");
	   
	   // 3. sum of list 
	   int sum = list.stream().mapToInt(x -> x.intValue()).sum();
	   System.out.println(sum);
	   
	   System.out.println("============");
	   
	   // 4. average of list 
	   double average = list.stream().mapToInt(x -> x.intValue()).average().getAsDouble();
	   System.out.println(average);
	   
	   System.out.println("============");
	   
	   // 5. sort a list 
	   list.stream().sorted().forEach(x -> System.out.println(x));
	   System.out.println("============");
	   
	   //count string with specific prefix 
	   List<String> names = Arrays.asList("vinod", "hitesh" ,"mohit" , "ajay");
	   System.out.println(names);
	   long count = names.stream().filter(i -> i.startsWith("a")).count();
	   System.out.println(count);
	   System.out.println("============");
	   
	   // 6. convert a list into upper case 
	   names.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));
	   
	   System.out.println("============");
	   // 7. Check if Any String Matches a Condition
	   boolean a =  names.stream().anyMatch(i -> i.contains("vinod"));
	   System.out.println(a);
	   
	   System.out.println("============");
	   
	   // 8. Find Duplicate Elements in a List
	   
	   Set<Integer> unique = new HashSet<>();
	   
	   Set<Integer> duplicates = list.stream().filter(i -> !unique.add(i)).collect(Collectors.toSet());
	   System.out.println(unique); 
	   System.out.println(duplicates);
	   
	   System.out.println("============");
	   
	   // 9. Group Strings by Length
	   List<String> names2 = Arrays.asList("java" , "code" , "vinod" , "ramesh" , "jdk" ,"jvm");
	   
	   Map<Integer , List<String>> groupbylength = names2.stream().collect(Collectors.groupingBy(x -> x.length()));
	   System.out.println(groupbylength);
	   
	   System.out.println("============");
	   
	   //10 . flatten a list of lists 
	   
	   List<List<Integer>> listoflists = Arrays.asList(
			   
			   Arrays.asList(1,2,3),
			   Arrays.asList(4,5,6),
			   Arrays.asList(7,8,9)
		 );
	   
	   List<Integer> flatedlist = listoflists.stream().flatMap( x -> x.stream()).collect(Collectors.toList());
	   System.out.println(flatedlist);
	   
	   System.out.println("============");
	   
	   // 11.Concatenate Strings
	   
	    Optional<String> concatinate =  names2.stream().reduce( (s1, s2) -> s1+" "+s2);
	   System.out.println(concatinate);
	   
	   // 12. Find the Longest String
	   
	  String longest = names2.stream().reduce( (n1 , n2) -> n1.length() > n2.length() ? n1 : n2).orElse(null);
	 System.out.println(longest);
	 
	 // 13 Group Strings by Length
	  Map<Integer , List<String>> groupbyl = names2.stream().collect(Collectors.groupingBy( x -> x.length()));
	 System.out.println(groupbyl);
	 
	 // 14. Count Frequency of Characters in a String
	 String str1 = "Hello";
	 Map<Character , Long> frequency = str1.chars().mapToObj( c -> (char) c).collect(Collectors.groupingBy( c -> c , Collectors.counting()));
	   System.out.println(frequency);
	   
	 // 15. remove null from list 
     List<Integer> List3 = Arrays.asList(10,20,30,null ,49,50,null);
     
     List<Integer> nullremoved = List3.stream().filter(x -> x !=null).collect(Collectors.toList());
	 System.out.println(nullremoved); 
	 System.out.println(List3);
	 
	 // 16 collect map from list 
	 List<String> words = Arrays.asList("Java", "Stream", "API");
	 Map<String, Integer> wordLengthMap = words.stream().collect(Collectors.toMap(word -> word, String::length));
	 System.out.println(wordLengthMap);
	 
	 // 17. Partition Numbers into Even and Odd
	 
	 List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	 
	 Map<Boolean , List<Integer>> partition = list5.stream().collect(Collectors.partitioningBy( i -> i%2 ==0));
	 System.out.println(partition);
	 
	 // 18. find second highest number 
	 int secondhighest = list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	 System.out.println(secondhighest);
	 
	 
	 //20 find palindromic strings 
	 List<String> nameList = Arrays.asList("level" , "madam" , "java" , "vinod" , "vijay");
	 
	 List<String> palindromeList = nameList.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
	 System.out.println(palindromeList);
	 
	 //21 reverse each string in a list 
	 List<String> reverse = nameList.stream().map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
	 System.out.println(reverse);
	 
	 // 
}
}
