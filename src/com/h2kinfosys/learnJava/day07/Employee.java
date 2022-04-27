package com.h2kinfosys.learnJava.day07;

public abstract class Employee extends Person{

    public Employee(){
        System.out.println("Employee Constructor");
    }

    public abstract void validateAddress();

    public abstract void bgCheck();

    /*
    @Override
    public void getBankAccount() {
        System.out.println("Apply Bank Account in Company Preferred Bank");
    }
*/
    @Override
    public void creditCard() {
        super.creditCard();
        System.out.println("Employee Benefits Company Credit Card");
        System.out.println("Eligible for " + country);
    }
}
