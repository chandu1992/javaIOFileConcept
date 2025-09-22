package com.jarvis.java_io.printWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/bufferredWriternote.txt");

        pw. write(100);
        pw.println(100);
        pw.println(true);
        pw.println("C");
        pw.println("chandra form pune");
        pw.flush();
        pw.close();

    }
}
