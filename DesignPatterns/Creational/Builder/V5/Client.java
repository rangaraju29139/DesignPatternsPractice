package DesignPatterns.Creational.Builder.V5;

public class Client {
    public static void main(String[] args) {

        Builder b = new Builder();

        b.name = "rangaraju";
        b.age = 26;
        Student s = new Student(b);
        System.out.println(s.getName());

    }
}
