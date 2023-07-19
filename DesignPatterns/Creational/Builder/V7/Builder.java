package DesignPatterns.Creational.Builder.V7;

public class Builder {
    String name;
    int age;

//    public Builder(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student build(){
        return new Student(this);
    }
}
