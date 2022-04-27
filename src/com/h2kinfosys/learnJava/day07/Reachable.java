package com.h2kinfosys.learnJava.day07;

import java.util.List;

public interface Reachable {
    /**
        Variables in interface are constants - public static final
     */
    String validator = "getresponse";
    /**
        Methods in interface are always public abstract
     */
    void validateEmailAddress(String email);
    void validatePhoneNumber(String phoneNumber);

    default void testDefaultMethod(String param){
        System.out.println("This is possible now"+ param);
        privateMethods(param);
    }

    private void privateMethods(String param){
        System.out.println("Private Methods are allowed in interfaces " + param);
    }


}
