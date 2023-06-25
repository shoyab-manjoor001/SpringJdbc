package com.springcore.springjdbc.Mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.springcore.springjdbc.entiites.Employee;

@Component
public class EmpRowMapper implements RowMapper<Employee>{

	@Nullable
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getInt(3));
		return emp;
	}

}
