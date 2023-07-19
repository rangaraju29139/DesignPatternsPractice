package DesignPatterns.Creational.Builder.V8;


public class Student {
    private String name;
    private int age;


    private  Student(Builder b) {
        name = b.name;
        age = b.age;
    }
    static Builder getBuilder(){

        return new Builder();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


    static class Builder {
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






    //    String batch;
//    int id;
//    String universityName;
//    int graduationYear;
//    String PhoneNumber;
}
