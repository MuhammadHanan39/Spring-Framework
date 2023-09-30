package com.bootwithorm.bootorm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //Autowiring the Object Of StudentService class
    @Autowired    
    private StudentService studentService;



    //Request Method for getting All the Students
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        
        List<Student> list=this.studentService.getAllStudents();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }



    //Request Method 
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int studentId){
        
        try {
            Student student=this.studentService.getById(studentId);
            return ResponseEntity.of(Optional.of(student));            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        
        try {
            Student s =this.studentService.createStudent(student);
            return ResponseEntity.of(Optional.of(s));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") int studentId){
        try{
            this.studentService.deleteById(studentId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        try {
            Student s=this.studentService.updateStudentById(student, studentId);
            return ResponseEntity.of(Optional.of(s));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
