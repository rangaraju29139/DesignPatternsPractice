package DesignPatterns.Creational.Builder.V2;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {

        if(age <0 || age >100){
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.name = name;
        this.age = age;
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
