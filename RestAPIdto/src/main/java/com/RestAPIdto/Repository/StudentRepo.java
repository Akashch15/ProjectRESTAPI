package com.RestAPIdto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestAPIdto.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
