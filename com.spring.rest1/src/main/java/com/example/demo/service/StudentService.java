package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student fetchStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
	public Student updateStudent(Long id,Student student) {
		return studentRepository.save(student);
	}
}
