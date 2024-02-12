package com.sourav.java.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.nimbusds.jose.shaded.gson.Gson;


 class Person implements Serializable {
    
	private static final long serialVersionUID = 7571849570273650942L;
	private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Serialization {

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        //Java In Built Serialization
        FileOutputStream fos = new FileOutputStream("person.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
        fos.close(); 
        
        
        
        //JSON Serialization
        // Creating a Gson object
        Gson gson = new Gson();

        // Serializing the Person object to JSON
        String json = gson.toJson(person);

        // Printing the JSON representation
        System.out.println(json);
    }
    

}
