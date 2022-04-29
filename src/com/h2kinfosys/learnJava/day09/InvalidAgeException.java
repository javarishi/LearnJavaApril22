package com.h2kinfosys.learnJava.day09;

public class InvalidAgeException extends RuntimeException{


    public InvalidAgeException() {
        super();
    }


    public InvalidAgeException(String s) {
        super(s);
    }
}
