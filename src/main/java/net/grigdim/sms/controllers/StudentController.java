package net.grigdim.sms.controllers;

import net.grigdim.sms.entities.Student;
import net.grigdim.sms.exceptions.StudentNotFoundException;
import net.grigdim.sms.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Long id) throws StudentNotFoundException {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students/save")
    public String createStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student created successfully";
    }

    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
        return "Student data updated successfully";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
}
