package DesignPatterns.Creational.Builder.V4;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        Builder b = new Builder();

        b.name = "rangaraju";
        b.age = 26;
        Student s = new Student(b);
        System.out.println(s.getName());

    }
}
