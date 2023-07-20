package DesignPatterns.Creational.Prototype.V2;

public class Student {
    String collegeName;
    String collegeAddress;
    String studentId;
    String studentType;
    public Student(){

    }


    public Student(Student s){
        this.studentId = s.studentId;
        this.collegeName = s.collegeName;
        this.collegeAddress = s.collegeAddress;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getStudentType(){
        return studentType;
    }

}
