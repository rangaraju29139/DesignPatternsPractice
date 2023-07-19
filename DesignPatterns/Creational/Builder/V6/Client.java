package DesignPatterns.Creational.Builder.V6;

public class Client {
    public static void main(String[] args) {

        Builder b = Student.getBuilder();

        b.name = "rangaraju";
        b.age = 26;
        Student s = new Student(b);
        System.out.println(s.getName());

    }
}
