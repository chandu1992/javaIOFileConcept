package com.jarvis.java_io.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/bufferredWriternote.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(100);
        bw.newLine();
        char[] charr = {'x','y','z'};
        bw.write(charr);
        bw.newLine();
        bw. write("chandra is learning java IO operations");
        bw.newLine();
        bw.flush();
        bw.close();


    }
}
