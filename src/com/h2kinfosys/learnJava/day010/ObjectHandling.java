package com.h2kinfosys.learnJava.day010;

import java.io.*;

public class ObjectHandling {

    private static String filePath = "/RISHI/H2K/FileIO/customer.obj";

    public static void main(String[] args) throws IOException {
        Customer custO1 = new Customer("1001", "David", "3305 Spring Hill Pwky");
        FileOutputStream fout = new FileOutputStream(filePath);
        ObjectOutputStream objOut = new ObjectOutputStream(fout);
        objOut.writeObject(custO1);
        fout.close();
        objOut.close();

        ObjectInputStream ObjIn = new ObjectInputStream(new FileInputStream(filePath));
        try {
            Customer customer = (Customer) ObjIn.readObject();
            System.out.println(customer.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ObjIn.close();

    }
}
