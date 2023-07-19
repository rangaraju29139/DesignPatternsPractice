package DesignPatterns.Creational.Builder.V6;


public class Student {
    private String name;
    private int age;


    public Student(Builder b) {
        this.name = b.name;
        this.age = b.age;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

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



    //    String batch;
//    int id;
//    String universityName;
//    int graduationYear;
//    String PhoneNumber;
}
