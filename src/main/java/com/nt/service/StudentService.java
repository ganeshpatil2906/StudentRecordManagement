package com.nt.service;



//package com.example.student.service;

//import com.example.student.entity.Student;
import java.util.List;

import com.nt.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
}
