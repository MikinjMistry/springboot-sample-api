package com.rest.api.service;

import java.util.List;

import com.rest.api.entity.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	public List<Student> addStudent(Student s);
	public List<Student> updateStudent(Student s);
	public List<Student> deleteStudent(long id);
}
