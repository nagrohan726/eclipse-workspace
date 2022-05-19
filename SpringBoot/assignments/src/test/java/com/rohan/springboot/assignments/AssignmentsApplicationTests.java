package com.rohan.springboot.assignments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rohan.springboot.assignments.studentapi.Student;
import com.rohan.springboot.assignments.studentapi.StudentRepository;
import com.rohan.springboot.assignments.sumof2nums.SumOf2Nums;

@SpringBootTest
class AssignmentsApplicationTests {

	@Autowired
	StudentRepository repo;

	@Test
	void sumOf2Nums() {
		System.out.println(SumOf2Nums.sum(5.5, 6.5));
	}

	@Test
	void studentJpaCreate() {
		Student student = new Student();
		student.setId(1);
		student.setName("Rohan");
		student.setTestscore(100);
		Student saveStudent = repo.save(student);
		assertEquals(saveStudent.getId(), 1L);
		assertEquals(saveStudent.getName(), "Rohan");
		assertEquals(saveStudent.getTestscore(), 100);
	}

	@Test
	void studentJpaRead() {
		Student student = new Student();
		student.setId(1);
		student.setName("Rohan");
		student.setTestscore(100);
		repo.save(student);
		Student findStudent = repo.findById(1L).get();
		assertEquals(findStudent.getId(), 1L);
		assertEquals(findStudent.getName(), "Rohan");
		assertEquals(findStudent.getTestscore(), 100);
	}

	@Test
	void studentJpaUpdate() {
		Student student = new Student();
		student.setId(1);
		student.setName("Rohan");
		student.setTestscore(100);
		repo.save(student);
		student = repo.findById(1L).get();
		assertEquals(student.getName(), "Rohan");
		student.setName("Rohan Nag");
		repo.save(student);
		assertEquals(repo.findById(1L).get().getName(), "Rohan Nag");
	}

	@Test
	void studentJpaDelete() {
		repo.deleteById(1L);
		assertTrue(repo.findById(1L).isEmpty());
	}

}
