package DesignPatterns.Creational.Prototype.V1;

public class Student {
    String collegeName;
    String collegeAddress;
    int studentId;
    public Student(){

    }

    public Student(Student s){
        this.studentId = s.studentId;
        this.collegeName = s.collegeName;
        this.collegeAddress = s.collegeAddress;
    }


}
