package com.h2kinfosys.learnJava.day06;

public class Tester {


    public static void main(String[] args) {

        Customer cust = new Customer("Niel", "101");

        cust.printCustomer();
        System.out.println(cust.validateName("A"));

        //Person person = new Person("Niel");
    }
}
