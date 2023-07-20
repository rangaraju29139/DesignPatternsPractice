package DesignPatterns.Creational.Prototype.V2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class StudentRegistry {


    private final Map<String, Student> map;



    private static StudentRegistry instance = new StudentRegistry();

    public static StudentRegistry getInstance() {
        return instance;
    }
    private StudentRegistry() {
        map =   new ConcurrentHashMap<String,Student>();
    }
    public Student addStudent(Student student) {
       return  map.put(student.getStudentType(), student);
    }
    public Student getStudent(String studentId) {
        return map.get(studentId);
    }


}
