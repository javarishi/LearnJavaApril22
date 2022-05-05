package com.h2kinfosys.learnJava.day010;

import java.io.File;
import java.io.IOException;

public class TestFiles {

    private static String filePath = "/RISHI/H2K/FileIO/demofile.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("Yes File Exists");
            System.out.println("file.canRead() :: " + file.canRead());
            System.out.println("file.canWrite() :: " +file.canWrite());
            System.out.println("file.canExecute() :: " +file.canExecute());
            System.out.println("file.getPath() :: " + file.getPath());
            System.out.println("file.getAbsolutePath() :: " + file.getAbsolutePath());
            System.out.println("file.getCanonicalPath() :: " + file.getCanonicalPath());
            System.out.println("file.getParent() :: " + file.getParent());
            System.out.println("file.getName() :: " + file.getName());

            File dirFile = new File(file.getParent());
            System.out.println("dirFile.getTotalSpace() :: " + dirFile.getTotalSpace());
            System.out.println("dirFile.getUsableSpace() :: " + dirFile.getUsableSpace());
            System.out.println("dirFile.getFreeSpace() :: " + dirFile.getFreeSpace());

            File temp = new File(file.getParent()+ "/temp");

            if(!temp.exists()){
                temp.mkdir();
                System.out.println("Temp directory created " + temp.getPath());
            }

            File[] listOfFiles = dirFile.listFiles();
            // String[] listOfFileNames = dirFile.list();
            File destFile = null;
            for (File eachFile : listOfFiles){
                if(eachFile.getName().indexOf(".csv") != -1) {
                    System.out.println("File Name :: " + eachFile.getName());
                    destFile = new File(temp.getPath() + "/" + eachFile.getName() );
                    System.out.println(destFile.getAbsolutePath());
                    if(destFile.exists()) {
                        System.out.println("No Need to Copy " + destFile.getAbsolutePath());
                    }else{
                        eachFile.renameTo(destFile);
                    }
                }
            }

        }else{
            System.out.println("File doesn't exists");
        }
    }
}
