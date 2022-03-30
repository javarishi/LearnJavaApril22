package com.h2kinfosys.learnJava.day02;

public class WrapperClasses {



    public static void main(String[] args) {
        Byte byteData = 99;
        Short shortData = 9999;
        Integer intData = 999999999;
        Long longData = 999999999999999L;

        Float floatData = 123.456f;
        Double doubleData = 123.45678d;

        Character charData = '$';
        Boolean booleanData = true;

        System.out.println(byteData + "  " + Byte.MIN_VALUE + "  " + Byte.MAX_VALUE);
        System.out.println(shortData + "  " + Short.MIN_VALUE + "  " + Short.MAX_VALUE);
        System.out.println(intData+ "  " + Integer.MIN_VALUE + "  " + Integer.MAX_VALUE);
        System.out.println(longData+ "  " + Long.MIN_VALUE + "  " + Long.MAX_VALUE);
        System.out.println(floatData+ "  " + Float.MIN_VALUE + "  " + Float.MAX_VALUE);
        System.out.println(doubleData+ "  " + Double.MIN_VALUE + "  " + Double.MAX_VALUE);
        System.out.println(charData+ "  " + Character.MIN_VALUE + "  " + Character.MAX_VALUE);
        System.out.println(booleanData+ "  " + Boolean.TRUE + "  " + Boolean.FALSE);

        String age = "21";
        int int_age = Integer.parseInt(age);
        System.out.println(int_age);
    }


}
