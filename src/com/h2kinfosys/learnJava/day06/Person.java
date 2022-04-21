package com.h2kinfosys.learnJava.day06;

// final classes cannot be inherited from
public class Person {

    protected String address = "Default Address for Person";

    public Person(String name){
        System.out.println("Person Constructor, with name ::" + name);
    }

    // if parent method is final - no child can override it
    protected boolean validateName(String name){
        if (name != null && name.trim().length() > 0){
            return true;
        }else{
            return false;
        }
    }
}
