package com.SchoolManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolManagement.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
