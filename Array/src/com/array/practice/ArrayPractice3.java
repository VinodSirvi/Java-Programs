package com.array.practice;

public class ArrayPractice3 {
       public static void main(String[] args) {
    	   // even elements in array 
		System.out.println("Find even elements in array ");
		int arr[] = {0,1,2,3,4,5,6,7,8,-9};
		int element = 0;
		int newArr[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			element = arr[i];
			if(element%2==0) {
				newArr[i] = element;
				System.out.println(newArr[i]);
			}
		}
		System.out.println("========================");
		// odd elements in array 
		System.out.println("odd elements in array");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 !=0) {
				System.out.println(arr[i]);
			}
		}
       System.out.println("==========================");
       //count even and odd elements in array 
       System.out.println("count of even and odd elements ");
       int even =0 ;
       int odd = 0;
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i]%2 ==0) {
    		   even++;
    	   }
    	   else odd++;
       }
       System.out.println("even => "+even+" odd => "+odd);
       
       System.out.println("=======================");
       //find positive and negative numbers in array
       System.out.println("positive and negative numbers in array");
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] >0) {
    		   System.out.println(arr[i]+" is positive");
    	   }
    	   else System.out.println(arr[i]+" is negative");
       }
       
       System.out.println("==========================");
       System.out.println("count negative , positive and zero");
       int positive = 0;
       int negative = 0;
       int zero = 0;
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] > 0) {
    		   positive++;
    	   }
    	   else if(arr[i] < 0) {
    		   negative++;
    	   }
    	   
    	   else zero++;
       }
       
       System.out.println("positive => "+positive+" negative =>"+negative+" zero =>"+zero);
       
       System.out.println("=========================");
       System.out.println("search an element in array");
       //searching element in array
       
       int key = 5;
       boolean flag = false;
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] ==key) {
    		   flag = true;
    		   break;
    	   }
       }
       if(flag) System.out.println("element found");
       else System.out.println("not found");
       
       System.out.println("============================");
       System.out.println("find the index of given element");
       
       int index = 0;
       boolean flag1 = false;
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] == key) {
    		   index =i;
    		   flag1 = true;
    		   break;
    	   }
       }
       if(flag1) System.out.println("element found at index "+index);
       else System.out.println("element not found");
       
       System.out.println("===============================");
       System.out.println("replace all negative number with zero");
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] <0) {
    		   arr[i] =0;
    	   }
    	   System.out.println(arr[i]);
       }
       
       System.out.println("============================");
       System.out.println("multiply all elements by 2");
       for(int i=0; i<arr.length; i++) {
    	   arr[i] = arr[i]*2;
    	   System.out.println(arr[i]);
       }
}
}
