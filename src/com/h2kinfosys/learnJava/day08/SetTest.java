package com.h2kinfosys.learnJava.day08;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        TreeSet<String> names= new TreeSet<>();
        if(args != null && args.length >0){
            for(String eachArg : args){
                names.add(eachArg);
            }
        }
        System.out.println(names);
        System.out.println("Able to add duplicate name? " + names.add("Rishi"));

        for (String eachValue : names){
            System.out.println(eachValue);
        }

        if (names.contains("Rishi")){
            System.out.println("rishi works here");
        }

        names.remove("Nikhil");
        System.out.println(names);

        System.out.println(names.size());
        names.clear();
        System.out.println(names);
    }
}
