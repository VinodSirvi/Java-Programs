package com.oops;

class Super {

    // final variable
    final int AGE = 50;

    // final method
    final void showAge() {
        System.out.println("Parent Age: " + AGE);
    }
}

class Sub extends Super {

    //  Cannot override final method
    /*
    void showAge() {
        System.out.println("Child Age");
    }
    */

    void display() {
        System.out.println("Accessing final variable from Parent: " + AGE);
    }
}

public class FinalKeyword {

    public static void main(String[] args) {

        Sub obj = new Sub();
        obj.showAge();
        obj.display();

        // obj.AGE = 60; ❌ Error: cannot assign a value to final variable
    }
}
