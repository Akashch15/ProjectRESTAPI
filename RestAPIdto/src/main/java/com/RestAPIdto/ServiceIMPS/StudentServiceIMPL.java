package com.RestAPIdto.ServiceIMPS;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.RestAPIdto.Entity.Student;
import com.RestAPIdto.Repository.StudentRepo;
import com.RestAPIdto.Services.StudentService;
import com.RestAPIdto.model.StudentDTO;
import com.RestAPIdto.util.Convertor;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    StudentRepo r;

    @Autowired
    Convertor c;
    @Override
    public StudentDTO createStudent( Student st) {
    	Student st1 = r.save(st);
		return c.converttostudentdto(st1);
	}

    @Override
    public List<StudentDTO> getStudents() {
        List<Student>st=r.findAll();
        List<StudentDTO>dtolist=new ArrayList();
        for(Student s:st)
        {
        dtolist.add(c.converttostudentdto(s));

        }
        return dtolist;
    }

    @Override
    public StudentDTO getStudentById(int id) {
    	Student s=r.findById(id).orElse(null);
    	return c.converttostudentdto(s);  // Using orElse to handle the case when the student is not found
    }

    @Override
    public StudentDTO updateStudent(int id, Student s) {
        Student existingStudent = r.findById(id).orElse(null);

            existingStudent.setName(s.getName());
            existingStudent.setPhoneno(s.getPhoneno());
            existingStudent.setAddress(s.getAddress());
            Student ss= r.save(existingStudent);
            return c.converttostudentdto(ss);
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
