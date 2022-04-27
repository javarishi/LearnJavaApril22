package com.h2kinfosys.learnJava.day07;

public class Manager extends Employee implements Reachable, Comparable{

    public Manager(){
        System.out.println("Manager Constructor");
      //  validator = "New Value";
    }
    @Override
    public void validateAddress() {
        System.out.println("Google Map Address Validation");
    }

    @Override
    public void bgCheck() {
        System.out.println("Bg Check from Private Company");
    }

    @Override
    public void getBankAccount() {
        System.out.println("Apply Bank Account in Company Preferred Bank");
    }

    @Override
    public void validateEmailAddress(String email) {
        if(email != null && email.trim().length() > 0 && email.indexOf("@") > 0) {
            System.out.println("Valid Email address provided , validated by " + Reachable.validator);
        }
    }

    @Override
    public void validatePhoneNumber(String phoneNumber) {
        if(phoneNumber != null && phoneNumber.trim().length() == 10) {
            System.out.println("Valid phoneNumber provided");
        }
    }

    @Override
    public void testDefaultMethod(String param) {
        Reachable.super.testDefaultMethod(param);
        System.out.println("Default methods from interface can be overridden");
    }

    @Override
    public int compareTo(Object o) {
        if (this.equals(o)){
            return 0;
        }
        return 1;
    }
}
