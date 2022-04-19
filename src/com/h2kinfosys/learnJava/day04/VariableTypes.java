package com.h2kinfosys.learnJava.day04;

public class VariableTypes {

    // Instance variables - class
    String firstName;
    int someValue;
    String company;

    // static modifier
    static float tax = 12.36f;

    public static void main(String[] args) {
        int localVariable = 100;

        // ClassName objectName = new ClassName();
        VariableTypes vt1 = new VariableTypes();
        vt1.firstName = "Neil";
        System.out.println(VariableTypes.tax);
        System.out.println(vt1.someValue);
        VariableTypes vt2 = new VariableTypes();
        vt2.firstName = "Buzz";
    }
}
