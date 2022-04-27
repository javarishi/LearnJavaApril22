package com.h2kinfosys.learnJava.day07;

public abstract class Person {

    public Person(){
        System.out.println("Person Constructor");
    }

    protected String country = "United States of America";

    /**
     * abstract classes can have non-abstract methods
     * abstract methods must be in abstract classes
     */
    public void creditCard(){
        System.out.println("Apply Any Credit Card");
    }

    public abstract void getBankAccount();

}
