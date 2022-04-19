package com.rohan.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rohan.springdatajpa.entities.Student;
import com.rohan.springdatajpa.repos.StudentRepository;

@SpringBootTest
class Springdatajpa2ApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("Rohan");
		student.setScore(100);
		repository.save(student);

		Student savedStudent = repository.findById(1L).get();
		assertNotNull(savedStudent);
	}

}
