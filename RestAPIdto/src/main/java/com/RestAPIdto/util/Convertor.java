package com.RestAPIdto.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import com.RestAPIdto.Entity.Student;
import com.RestAPIdto.model.StudentDTO;

@Component
public class Convertor {
	//Converstion from dto to entity
	
	public Student converttostudententity(StudentDTO ref) {
		Student s= new Student();
		if(ref!=null)
		{
			BeanUtils.copyProperties(ref, s);
		}
		return s;
	}
	
	//Converstion from entity to dto
	public StudentDTO converttostudentdto(Student s) {
		StudentDTO res= new StudentDTO();
		if(s!=null)
		{
			BeanUtils.copyProperties(s, res);
		}
		return res;
	}
}
