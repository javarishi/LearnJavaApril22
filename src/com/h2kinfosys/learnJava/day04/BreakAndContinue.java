package com.h2kinfosys.learnJava.day04;

public class BreakAndContinue {

    public static void main(String[] args) {
        int count = 1;
        int total = 0;
        while (count <= 10){
            if (count == 5){
                System.out.println("Found an Error : using break");
                // break;
                count++;
                continue;
            }
            total = total + count;
            System.out.println(count);
            count++;
        }
    }
}
