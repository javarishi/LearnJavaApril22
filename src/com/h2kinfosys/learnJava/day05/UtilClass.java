package com.h2kinfosys.learnJava.day05;

public class UtilClass {

    public static boolean validateStrings(String strData){
        if(strData != null && strData.strip().length() > 0){
            return true;
        }else{
            return false;
        }
    }
}
