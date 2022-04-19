package com.rohan.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohan.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
