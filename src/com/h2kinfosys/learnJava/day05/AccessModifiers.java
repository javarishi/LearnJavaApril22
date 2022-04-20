package com.h2kinfosys.learnJava.day05;

public class AccessModifiers {

    private String privateVariable = "This is Private Variable";
    protected String protectedVariable = "This is Protected Variable";
    String defaultVariable = "This is Default Variable";
    public String publicVariable = "This is Public Variable";

    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();
        System.out.println(access.publicVariable);
        System.out.println(access.defaultVariable);
        System.out.println(access.protectedVariable);
        System.out.println(access.privateVariable);

    }
}
