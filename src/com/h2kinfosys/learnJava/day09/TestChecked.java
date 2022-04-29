package com.h2kinfosys.learnJava.day09;

public class TestChecked {

    /*
    if method throws Runtime exception then try catch is not enforced
     */
    public static void main(String[] args) {
        TestChecked test = new TestChecked();
        test.validateAge(15);
        try {
            test.tick_seconds(100);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    // throws - is a warning attached to method signature - for checked exception
    // throw is throwing an exception from method block - intentional
    public void tick_seconds(int count)  throws Exception{
        for(int i = 0; i < count; i++){
            System.out.println("Value of i " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }
    }

    // Custom Exception - InvalidAgeException
    public void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 && age > 121){
            throw new InvalidAgeException("Age out of range");
        }else{
            if(age >= 18){
                System.out.println("Perfect!");
            }else{
                throw new InvalidAgeException("Age is insufficient");
            }
        }
    }
}
