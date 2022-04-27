package com.h2kinfosys.learnJava.day08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {



    public static void main(String[] args) {
       // ArrayList<String> names = new ArrayList<>();
        LinkedList<String> names = new LinkedList<>();
        names.add("Daniel");
        names.add("Rao");
        names.add("Rao");
        names.add("Rishi");
        names.add(1, "Arun");
        System.out.println(names);

        if(args != null && args.length >0){
            for(String eachArg : args){
                names.add(eachArg);
            }
        }

        System.out.println(names.get(1));

        System.out.println(names.size());
        names.remove(0);
        names.remove("Rao");
        System.out.println(names);

        for (String eachValue : names){
            System.out.println(eachValue);
        }

        if (names.contains("Rishi")){
            System.out.println("Yes Rishi works here");
        }

        names.clear();
        System.out.println(names);
    }

}
