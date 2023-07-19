package DesignPatterns.Creational.Builder.V3;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        HashMap<String,Object> map = new HashMap<String,Object>();;
        map.put("name", "rangaraju");
        map.put("age",26);
        Student s = new Student(map);


    }
}
