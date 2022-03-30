package com.h2kinfosys.learnJava.day02;

public class Operators {

    public static void main(String[] args) {
        // mathematical operators
        int varOne = 9;
        int varTwo = 2;
        System.out.println("Addition " + (varOne + varTwo));
        System.out.println("Subtraction " + (varOne - varTwo));
        System.out.println("Division " + (varOne / varTwo));
        System.out.println("Multiplication " + (varOne * varTwo));
        System.out.println("Modulus (Reminder) " + (varOne % varTwo));
        System.out.println("Rest to Power " + Math.pow(varOne, varTwo));
        System.out.println("Random Value " + (int) (Math.random()*100));
        // H.W - Explore Math library for useful functions and create a list in word document
        // Article Tip - Explain in one line, example in one line


        // Comparison Operators: < <= > >= != ==
        // Result of Comparison operator is always Boolean
        System.out.println("Less Than " + (varOne < varTwo));
        System.out.println("Less Than or equals " + (varOne <= varTwo));
        System.out.println("Greater Than " + (varOne > varTwo));
        System.out.println("Greater Than or equals " + (varOne >= varTwo));
        System.out.println("Not Equals " + (varOne != varTwo));
        System.out.println(" Equals " + (varOne == varTwo));

        // Logical Operators - AND, OR and NOT

        /*
            S1  S2  S1&S2
            T   T   T
            T   F   F
            F   T   F
            F   F   F
         */
        boolean s1 = true;
        boolean s2 = false;
        System.out.println(" AND Evaluation " + (s1 && s2));

         /*
            S1  S2  S1|S2
            T   T   T
            T   F   T
            F   T   T
            F   F   F
         */

        System.out.println(" OR Evaluation " + (s1 || s2));

        /*
        S1  !S1
        T   F
        F   T
         */

        System.out.println(" NOT Evaluation " + (!s1));
    }
}
