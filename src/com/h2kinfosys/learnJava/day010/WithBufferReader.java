package com.h2kinfosys.learnJava.day010;

import java.io.*;

public class WithBufferReader {

    private static String filePath = "/RISHI/H2K/FileIO/demofile.txt";
    private static String writefilePath = "/RISHI/H2K/FileIO/demofile_bwrite1.txt";
    private static String pwritefilePath = "/RISHI/H2K/FileIO/demofile_pwrite.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader bRead = null;
        BufferedWriter bWrite = null;
        PrintWriter pWrite = null;

        try{
            bRead = new BufferedReader(new FileReader(filePath));
            bWrite = new BufferedWriter(new FileWriter(writefilePath));
            pWrite = new PrintWriter(new FileWriter(pwritefilePath));

            String line  = null;

            while((line = bRead.readLine()) != null){
                System.out.println(line);
                bWrite.write(line);
                bWrite.newLine();
                pWrite.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            if(bRead != null) bRead.close();
            if(bWrite != null) bWrite.close();
            if(pWrite != null) pWrite.close();
        }
    }
}
