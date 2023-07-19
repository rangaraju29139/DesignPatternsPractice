package DesignPatterns.Creational.Builder.V3;


import java.util.HashMap;
public class Student {
    private String name;
    private int age;


    public Student(HashMap<String,Object> map) {
        if(map.containsKey("name")){
            this.name = (String) map.get("name");
        }
        if(map.containsKey("age")){
            this.age = (int) map.get("age");
        }
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
