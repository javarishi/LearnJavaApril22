package com.h2kinfosys.learnJava.day05;

public class TestAccessModifiersPackage {

    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();
        System.out.println(access.publicVariable);
        System.out.println(access.defaultVariable);
        System.out.println(access.protectedVariable);
        //System.out.println(access.privateVariable);
    }
}
