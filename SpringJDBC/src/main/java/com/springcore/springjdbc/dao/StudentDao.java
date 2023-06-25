package com.springcore.springjdbc.dao;

import java.util.List;

import com.springcore.springjdbc.entiites.Student;

public interface StudentDao {

	public int saveStudent(Student s);
	public int updateStudent(Student s);
	public int deleteStudent(Student s);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}
