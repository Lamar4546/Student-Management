package com.example.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.management.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
