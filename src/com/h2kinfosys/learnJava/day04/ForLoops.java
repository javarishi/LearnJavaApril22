package com.h2kinfosys.learnJava.day04;

public class ForLoops {

    public static void main(String[] args) {
        // Addition 1 to 10
        /**
            for(initialization, condition, modification){
                block of code which executes till condition is true
            }
         */
        int total = 0;
        for(int count = 1; count <=10; ++count){
            total = total + count;
            System.out.println("Count :: " + count);
        }
        System.out.println("Total :: " + total);

        int incr = 100;
        System.out.println("Incr :: " + (incr++));
        System.out.println("Increased Incr :: " + (incr));
        // ++ comes after variable - use the value then increase
        System.out.println("Updated Incr :: " + (++incr));
        // ++ comes before the variable - increase value then use

        int[] marks = {90,89,88,87,86,80};
        /*
        int length_marks = marks.length;
        int totalMarks = 0;
        for(int i = 0; i < length_marks; i++){
            totalMarks = totalMarks + marks[i];
            System.out.println("Marks :: " + marks[i]);
        }
        System.out.println("totalMarks :: " + totalMarks);
        */
        int totalMarks = 0;
        for(int eachSubMark : marks){
            totalMarks = totalMarks + eachSubMark;
        }
        System.out.println("totalMarks :: " + totalMarks);

        /**
         * for (dataType variable : collection<datatype>){
         *      block of code where variable will receive the data from collection one by one
         * }
         */
    }
}
