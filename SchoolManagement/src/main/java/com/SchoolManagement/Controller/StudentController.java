package com.SchoolManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SchoolManagement.Entity.Student;
import com.SchoolManagement.Services.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService ser;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student st) {
        return ser.createStudent(st);
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return ser.getStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id) {
        return ser.getStudentById(id);
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student st) {
        return ser.updateStudent(id, st);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public Student deleteStudent(@PathVariable int id) {
        return ser.deleteStudentById(id);
    }
}
