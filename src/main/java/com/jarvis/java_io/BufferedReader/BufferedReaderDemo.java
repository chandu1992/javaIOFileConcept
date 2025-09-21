package com.jarvis.java_io.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/bufferredWriternote.txt");

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
