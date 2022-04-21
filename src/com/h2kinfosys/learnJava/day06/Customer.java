package com.h2kinfosys.learnJava.day06;

public class Customer extends Person {

    private String zipcode = "00000";
    // final variables do not accept value change
    public final String companyName = "Best Buy Inc.";
    // Child class variable shadows variable from parent
    public String address = "Default Customer Address";

    public Customer(String name) {
        super(name);
        System.out.println("Customer Constructor");
    }

    public Customer(String name, String custId) {
        this(name);
        System.out.println("Customer Constructor, custId :: " + custId);
    }

    /**
     * 1. Access Modifier in Child cannot be stricter than Parent (private, default, protected, public)
     * 2. Return type should be co-variant (same class or child class of same parent)
     * 3. Method name - has to be same
     * 4. Parameters - Number and type of parameters exactly match,
     * 5. Exception - are co-variant (we will learn it in Exception handling)
     * 6. Method body can call super class method with super.methodName()
     * @param name
     * @return
     */

    @Override
    protected boolean validateName(String name) {
        if (super.validateName(name)) {
            if (name.trim().length() > 2) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void printCustomer(){
        System.out.println(this.address);
        System.out.println(this.zipcode);
    }
}
