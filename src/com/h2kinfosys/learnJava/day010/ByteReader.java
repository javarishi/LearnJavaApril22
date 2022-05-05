package com.h2kinfosys.learnJava.day010;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReader {

    private static String filePath = "/RISHI/H2K/FileIO/demofile.txt";
    private static String writefilePath = "/RISHI/H2K/FileIO/demofile_write.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout= null;

        try{
            fin = new FileInputStream(filePath);
            fout = new FileOutputStream(writefilePath);
            int c = 0;

            while((c = fin.read()) != -1){
                fout.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
           if(fin != null) fin.close();
           if(fout != null) fout.close();
        }
    }
}
