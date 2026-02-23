package com.farhan.studentapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.farhan.studentapi.model.Student;
import com.farhan.studentapi.repository.StudentRepository;
import com.farhan.studentapi.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Student not found with ID: " + id));
    }

    public Student updateStudent(Long id, Student updatedStudent) {

        Student student = getStudentById(id);

        student.setName(updatedStudent.getName());
        student.setEmail(updatedStudent.getEmail());
        student.setCourse(updatedStudent.getCourse());
        student.setMarks(updatedStudent.getMarks());

        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        repository.delete(student);
    }
}