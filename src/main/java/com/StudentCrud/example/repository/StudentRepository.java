package com.StudentCrud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentCrud.example.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
