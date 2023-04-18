package com.rest.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.entity.Student;
import com.rest.api.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	List<Student> list = new ArrayList<Student>();
	
	@Autowired
	StudentDao studentDao;

	public StudentServiceImpl() {
		
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.findAll();
	}
	
	
	@Override
	public List<Student> addStudent(Student s) {
		studentDao.save(s);
		return studentDao.findAll();
	}
	
	@Override
	public Student updateStudent(Student s) {
		Student stud = studentDao.getReferenceById(s.getId());
		stud.setName(s.getName());
		stud.setCity(s.getCity());
		return studentDao.save(stud);
	}
	
	@Override
	public List<Student> deleteStudent(long id) {
		studentDao.delete(studentDao.getReferenceById(id));
		return studentDao.findAll();
	}
}
