package DesignPatterns.Creational.Prototype.V2;

public class Client {

    public static void main(String[] args) {
            Student s = new Student();

            s.collegeAddress ="bhimavaram";
            s.collegeName = "srkr";
            s.studentType = "DayScholar";

            StudentRegistry sr = StudentRegistry.getInstance();
            sr.addStudent(s);


            Student day = sr.getStudent("DayScholar");

        System.out.println(" checking the day Scholar type" + day.studentType);


    }
}
