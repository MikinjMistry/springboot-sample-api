package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Student;
import com.rest.api.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public String home() {
		return "Welcome to the Rest API";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {		
		return studentService.getAllStudent(); 
	}
	
	@PostMapping("/students")
	public List<Student> addStudent(@RequestBody Student stud) {		
		return studentService.addStudent(stud); 
	}
	
	@PutMapping("/students")
	public List<Student> updateStudent(@RequestBody Student stud) {		
		return studentService.updateStudent(stud); 
	}
	
	@DeleteMapping("/students/{id}")
	public List<Student> updateStudent(@PathVariable String id) {		
		return studentService.deleteStudent(Long.parseLong(id)); 
	}
	
	

}
