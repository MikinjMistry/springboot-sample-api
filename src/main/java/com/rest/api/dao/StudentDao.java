package com.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.entity.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
