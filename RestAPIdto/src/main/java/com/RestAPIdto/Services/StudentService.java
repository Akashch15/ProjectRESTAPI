package com.RestAPIdto.Services;

import java.util.List;
import com.RestAPIdto.Entity.Student;
import com.RestAPIdto.model.StudentDTO;

public interface StudentService {

	StudentDTO createStudent(Student st);
	
	List<StudentDTO> getStudents();
	
	StudentDTO getStudentById(int id); 
	
	StudentDTO updateStudent(int id ,Student s);
	
	Student deleteStudentById(int id); 
	
}
