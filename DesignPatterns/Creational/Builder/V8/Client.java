package DesignPatterns.Creational.Builder.V8;

public class Client {
    public static void main(String[] args) {

        Student s = Student.getBuilder().setName("rangaraju").setAge(20).build();



        System.out.println(s.getName());

    }
}
