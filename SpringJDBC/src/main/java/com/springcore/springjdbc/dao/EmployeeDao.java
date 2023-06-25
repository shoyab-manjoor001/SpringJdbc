package com.springcore.springjdbc.dao;

import java.util.List;

import com.springcore.springjdbc.entiites.Employee;

public interface EmployeeDao {
	
	public int saveEmployee(Employee e);
	public int deleteEmployee(Employee e);
	public int updateEmployee(Employee e);
	public Employee getEmployee(int empId);
	public List<Employee> getEmployees();

}
