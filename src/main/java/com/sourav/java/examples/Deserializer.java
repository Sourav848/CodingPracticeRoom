package com.sourav.java.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        fis.close();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
