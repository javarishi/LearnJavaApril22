package com.h2kinfosys.learnJava.day05;

public class JavaMethods {

    public static void main(String[] args) {
        JavaMethods methods = new JavaMethods();
        String validate = methods.validateAddress("validate");
        System.out.println(validate);
        // static methods do not need instances - they can be accessed with classname
        System.out.println(UtilClass.validateStrings("Test"));
    }

    /**
     * Methods has six components. Methods follows same rules as variable names
     * 1. Access Modifier
     * 2. Return type
     * 3. name of method - camelCase (should be logical)
     * 4. Parameters in () - comma separated (input)
     * 5. Method Body {} - Logic Part
     * 6. Exception - if there is any expected Errors (will be covered in Exception handling)
     */

    public String validateAddress(String address){
        return "Valid";
    }

    /**
     * Changes - Number and / or type of parameters
     * Keeping other components intact
     * Overloading of Java Methods
     */

    public String validateAddress(int zipcode){
        return "Valid";
    }

    public String validateAddress(String addressline1, String city){
        this.validateAddress(addressline1);
        return "Valid";
    }
}

