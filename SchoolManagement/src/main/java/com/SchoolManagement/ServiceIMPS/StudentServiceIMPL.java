package com.SchoolManagement.ServiceIMPS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagement.Entity.Student;
import com.SchoolManagement.Repository.StudentRepo;
import com.SchoolManagement.Services.StudentService;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    StudentRepo r;

    @Override
    public Student createStudent(Student st) {
        return r.save(st);
    }

    @Override
    public List<Student> getStudents() {
        return r.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return r.findById(id).orElse(null); // Using orElse to handle the case when the student is not found
    }

    @Override
    public Student updateStudent(int id, Student s) {
        Student existingStudent = r.findById(id).orElse(null);

        if (existingStudent != null) {
            existingStudent.setName(s.getName());
            existingStudent.setPhoneno(s.getPhoneno());
            existingStudent.setAddress(s.getAddress());
            return r.save(existingStudent);
        }

        return null; // Handle the case when the student with the given id is not found
    }

    @Override
    public Student deleteStudentById(int id) {
        Student studentToDelete = r.findById(id).orElse(null);

        if (studentToDelete != null) {
            r.deleteById(id);
            return studentToDelete;
        }

        return null; // Handle the case when the student with the given id is not found
    }
}
