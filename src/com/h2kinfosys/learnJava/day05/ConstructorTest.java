package com.h2kinfosys.learnJava.day05;

public class ConstructorTest {

    /**
     * Constructor has six components. Constructor has exact same name as ClassName
     * 1. Access Modifier
     * 2. Return type - Constructor has no return type
     * 3. name of method - Constructor has exact same name as ClassName
     * 4. Parameters in () - comma separated (input)
     * 5. Method Body {} - Logic Part
     * 6. Exception - if there is any expected Errors (will be covered in Exception handling)
     */
    // this is called as default constructor - no-arg constructor
    public ConstructorTest(){
        System.out.println("This is Constructor for ConstructorTest ");
    }

    /**
     * this() -  is a constructor call
     * this() has to be the First Statement of Constructor
     * @param parameter
     */
    public ConstructorTest(String parameter){
        this();
        System.out.println("This is Constructor is overloaded " + parameter);
    }
    // Constructor chaining
    public ConstructorTest(String parameter1, String parameter2){
        this(parameter1);
        System.out.println("This is Constructor is overloaded " + parameter1 + " " + parameter2);
    }

    public static void main(String[] args) {
      //  ConstructorTest test1 = new ConstructorTest();
        ConstructorTest test2 = new ConstructorTest("Parametrized Constructor", "param2");
        // ClassName instance= new Constructor()
    }
}
