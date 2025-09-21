package com.jarvis.java_io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/MyNotes.txt");

        fw.write(100);
        fw.write("Chandra\n java io operations");
        fw.write("\n");
        char[] chArray = {'a','b','c','d'};
        fw.write(chArray);

        fw.write("\n");
        fw.flush();
        fw.close();

       // fw.write("close the file"); //  Exception in thread "main" java.io.IOException: Stream closed

        FileWriter fw1 = new FileWriter("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/MyNotes2ndFile.txt",true);

        fw1.write(100);
        fw1.write("Chandra\n java io operations");
        fw1.write("\n");
        char[] chArray1 = {'a','b','c','d'};
        fw1.write(chArray1);

        fw1.write("\n");
        fw1.flush();
        fw1.close();
    }
}
