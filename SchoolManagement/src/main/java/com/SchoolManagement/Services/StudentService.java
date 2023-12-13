package com.SchoolManagement.Services;

import java.util.List;

import com.SchoolManagement.Entity.Student;

public interface StudentService {

	Student createStudent(Student st);
	
	List<Student> getStudents();
	
	Student getStudentById(int id); 
	
	Student updateStudent(int id ,Student s);
	
	Student deleteStudentById(int id); 
	
}
