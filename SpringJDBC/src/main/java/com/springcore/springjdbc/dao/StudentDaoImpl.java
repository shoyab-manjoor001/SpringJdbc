package com.springcore.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springjdbc.entiites.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate template;

//	public JdbcTemplate getTemplate() {
//		return template;
//	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveStudent(Student s) {
		 String query = "insert into student(id,name,city) values(?,?,?)";
		return this.template.update(query,s.getId(),s.getName(),s.getCity());
	}

	public int updateStudent(Student s) {
		String query = "update student set name=? , city=? where id=?";
		return this.template.update(query,s.getName(),s.getCity(),s.getId());
	}

	public int deleteStudent(Student s) {
		String query = "delete from student where id=?";
		return this.template.update(query,s.getId());
	}

	

}
