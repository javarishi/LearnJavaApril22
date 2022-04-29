package com.h2kinfosys.learnJava.day09;

import com.h2kinfosys.learnJava.day06.Customer;
import com.h2kinfosys.learnJava.day07.Employee;
import com.h2kinfosys.learnJava.day07.Manager;
import com.h2kinfosys.learnJava.day07.Person;
import com.h2kinfosys.learnJava.day07.Reachable;

public class TestReferences {

    public static void main(String[] args) {
        // ClassName instanceName = new ClassConstructor()
        // ReferenceType instanceName = new InstanceType()
        Person personEmp = new Manager();
        // Visibility of methods comes from Reference Type.
        // Implementation / execution happens from Instance Type
        personEmp.creditCard();
        // ReferenceType can be a Parent Class or Interface
        Reachable emp = new Manager();
        emp.validatePhoneNumber("phoneNumber");

        Object obj = new Customer("ABC");
        // casting - changing reference known reference type of existing object
        TestReferences test = new TestReferences();
        test.stressTesting(obj);
        // Class Cast Exception
    }


    public void stressTesting(Object obj){
        Manager manager = (Manager) obj;
        manager.getBankAccount();
    }
}
