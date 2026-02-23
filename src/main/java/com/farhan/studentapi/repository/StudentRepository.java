package com.farhan.studentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farhan.studentapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}