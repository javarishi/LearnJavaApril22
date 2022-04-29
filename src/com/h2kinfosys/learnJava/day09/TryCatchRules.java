package com.h2kinfosys.learnJava.day09;

import com.h2kinfosys.learnJava.day06.Customer;

import java.util.ArrayList;
import java.util.List;

public class TryCatchRules {

    /**
     * Catch handles exception object - you can access object properties in catch block
     * try can have any number of catch blocks
     * you can add multiple exception References separated by |
     * catch(Exception ex) block handles everything in exception hierarchy
     * specific first generic later - Child First Parent Later
     * finally block always executes
     * try can either have catch or finally or both
     * @param args
     */

    public static void main(String[] args) {
            List<Integer> values = new ArrayList<>();
            values.add(0, 10);
            values.add(1, 10);
            Customer cust = null;
            try {
                double percent = values.get(1) / values.get(1);
                System.out.println(values);
                System.out.println("Percent is " + percent);
                //cust.printCustomer();
            }catch (ArithmeticException | IndexOutOfBoundsException aex){
                System.out.println(aex.getMessage());
            }
            catch(Exception ex){
                System.out.println("Too Generic but good at end " + ex);
            }finally {
                System.out.println("Finally Block always executes regardless there is an error or not");
            }

        }

}
