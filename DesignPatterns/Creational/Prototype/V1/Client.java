package DesignPatterns.Creational.Prototype.V1;

public class Client {

    public static void main(String[] args) {
            Student s = new Student();

            s.collegeAddress ="bhimavaram";
            s.collegeName = "srkr";
            s.studentId = 1;


            Student s1 = new Student(s);
            s1.studentId = 2;

    }
}
