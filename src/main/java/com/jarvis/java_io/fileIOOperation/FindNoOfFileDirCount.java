package com.jarvis.java_io.fileIOOperation;

import java.io.File;
import java.util.List;

public class FindNoOfFileDirCount {

    public static void main(String[] args) {
        File f = new File("/Users/chandrashekharbhaupande/Documents/");

        String[] fileDirData = f.list();
        int count =0;
        for(String fileOrDir : fileDirData){
            count++;

            File f1 = new File(f,fileOrDir);
            if(f1.isDirectory()){
                System.out.println(fileOrDir);
            }

        }
        System.out.println("Number of files and Directory : " +count);


    }
}
