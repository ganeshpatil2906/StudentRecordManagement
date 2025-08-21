package com.nt.repository;

//import com.example.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}