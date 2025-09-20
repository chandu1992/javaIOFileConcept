package com.jarvis.java_io.fileIOOperation;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/javaiocode.txt");
        System.out.println(f.exists()); // false (just create file object not javaiocode.txt create)

        f.createNewFile();  // create javaiocode.txt created
        System.out.println(f.exists()); // true

        f.delete();  // delete javaiocode
        System.out.println(f.exists()); // false


        File f1 = new File("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/myFolder");
        System.out.println(f1.exists());  // false

        f1.mkdir();
        System.out.println(f1.exists());  // true myfolder is create using f1.mkdir

        f1.delete();
        System.out.println(f1.exists()); // false myFolder is deleted
    }
}
