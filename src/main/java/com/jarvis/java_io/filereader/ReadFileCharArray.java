package com.jarvis.java_io.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCharArray {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/MyNotes2ndFile.txt");

        char[] charray = new char[(int)f.length()];

        FileReader fr = new FileReader(f);

        fr.read(charray);
        for(char c: charray){
            System.out.print(c);
        }
    }
}
