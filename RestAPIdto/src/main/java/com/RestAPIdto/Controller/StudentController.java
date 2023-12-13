package com.RestAPIdto.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.RestAPIdto.Entity.Student;
import com.RestAPIdto.Services.StudentService;
import com.RestAPIdto.model.StudentDTO;
import com.RestAPIdto.util.Convertor;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService ser;

    @Autowired
    private Convertor con;

    @PostMapping("/createStudent")
    public ResponseEntity<StudentDTO> createStudent(@Valid @RequestBody StudentDTO st) {
        try {
            Student s = con.converttostudententity(st);
            StudentDTO createdStudent = ser.createStudent(s);
            return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getStudents")
    public ResponseEntity<List<StudentDTO>> getStudents() {
        try {
            List<StudentDTO> students = ser.getStudents();
            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getStudentById/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable int id) {
        try {
            StudentDTO student = ser.getStudentById(id);
            if (student != null) {
                return new ResponseEntity<>(student, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@Valid @PathVariable int id, @RequestBody Student st) {
        try {
            StudentDTO updatedStudent = ser.updateStudent(id, st);
            if (updatedStudent != null) {
                return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id) {
        try {
            Student deletedStudent = ser.deleteStudentById(id);
            if (deletedStudent != null) {
                return new ResponseEntity<>(deletedStudent, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
