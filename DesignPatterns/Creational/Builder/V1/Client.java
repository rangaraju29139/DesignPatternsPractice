package DesignPatterns.Creational.Builder.V1;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 20;
        /**
         * here creation of incomplete objects makes and issue
         */
        System.out.println(s.batch);
    }
}
