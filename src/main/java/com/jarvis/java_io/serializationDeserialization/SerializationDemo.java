package com.jarvis.java_io.serializationDeserialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student studentObject = new Student();
        FileOutputStream fos = new FileOutputStream("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/serializeObj.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(studentObject);

        oos.close();

        FileInputStream fis = new FileInputStream("/Users/chandrashekharbhaupande/Documents/FileIOOperatio/serializeObj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student stuObj = (Student)ois.readObject();

        System.out.println(
                stuObj.name +" "+ stuObj.age +" "+ stuObj.emailId
        );

        ois.close();
    }
}
