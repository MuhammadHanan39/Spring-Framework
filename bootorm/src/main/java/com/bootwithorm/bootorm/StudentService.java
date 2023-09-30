package com.bootwithorm.bootorm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    ApplicationContext context;


    public List<Student> getAllStudents(){
        List<Student> list = null;
        return list;
    }


    public Student updateStudentById(Student student, int studentId) {
        Student s=null;
        return s;
    }


    public Student createStudent(Student student) {
        Student s=null;
        return s;
    }


    public Student getById(int studentId) {
        return null;
    }


    public void deleteById(int studentId) {
    }
    
}
