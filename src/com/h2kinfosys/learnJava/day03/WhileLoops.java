package com.h2kinfosys.learnJava.day03;

public class WhileLoops {

    public static void main(String[] args) {
        /*
            To add number from 1 to 10
         */
        /**
         * while (Condition){
         *      block of code executes when condition is true
         *      condition modifier
         * }
         *
         * Debug this code in your IDE. By applying debug point / break point
         */

        int count = 1;
        int total = 0;
        while (count <= 10){
            total = total + count;
            System.out.println(count);
            count++;
        }
    }
}
