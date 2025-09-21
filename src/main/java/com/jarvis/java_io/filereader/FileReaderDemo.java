package com.jarvis.java_io.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/MyNotes2ndFile.txt");

        int i = fr.read();
        while(i != -1){
            System.out.print((char)i);
            i = fr.read();
        }
    }
}
