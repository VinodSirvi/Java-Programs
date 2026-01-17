package com.string;

public class StringCreation {
    public static void main(String[] args) {
        
        // String Literal (stored in String Constant Pool)
        String s1 = "Java";
        String s2 = "Java";  // refers to the same object as s1
        
        // String using new keyword (stored in Heap memory)
        String s3 = new String("Java");
        String s4 = new String("Java");  // creates a new object again

        // Printing values
        System.out.println("String Literal s1: " + s1);
        System.out.println("String Literal s2: " + s2);
        System.out.println("Using new keyword s3: " + s3);
        System.out.println("Using new keyword s4: " + s4);

        // Comparison
        System.out.println("\nComparisons:");
        System.out.println("s1 == s2 : " + (s1 == s2));   // true (same pool)
        System.out.println("s1 == s3 : " + (s1 == s3));   // false (different object)
        System.out.println("s3 == s4 : " + (s3 == s4));   // false (different object)

        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (same value)
    }
}
