package com.springcore.springjdbc.dao;

import com.springcore.springjdbc.entiites.Employee;

public interface EmployeeDao {
	
	public int saveEmployee(Employee e);
	public int deleteEmployee(Employee e);
	public int updateEmployee(Employee e);

}
