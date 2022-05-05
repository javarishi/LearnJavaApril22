package com.h2kinfosys.learnJava.day010;

import java.io.*;

public class CharReader {

    private static String filePath = "/RISHI/H2K/FileIO/demofile.txt";
    private static String writefilePath = "/RISHI/H2K/FileIO/demofile_char.txt";

    public static void main(String[] args) throws IOException {
        FileReader fin = null;
        FileWriter fout= null;

        try{
            fin = new FileReader(filePath);
            fout = new FileWriter(writefilePath);
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
