package com.jarvis.java_io.fileIOOperation;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/javaiocode.txt");
        System.out.println(f.exists()); // false

        f.createNewFile();
        System.out.println(f.exists()); // true

        f.delete();
        System.out.println(f.exists()); // false
    }
}
