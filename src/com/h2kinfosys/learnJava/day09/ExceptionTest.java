package com.h2kinfosys.learnJava.day09;

import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {

    /**
     * try{
     *     risky block of code which might throw exception
     * }catch(Exception ex){
     *     block of code when exception occurs
     * }
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        System.out.println(list);
        try {
            list.get(9);
        }catch (IndexOutOfBoundsException iex){
            System.out.println("IndexOutOfBoundsException Handled " + iex);
        }
        System.out.println(list);
        System.out.println("This is why exception handling is required");
    }
}
