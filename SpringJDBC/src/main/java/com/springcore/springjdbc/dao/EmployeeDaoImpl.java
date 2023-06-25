package com.springcore.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.springcore.springjdbc.Mappers.EmpRowMapper;
import com.springcore.springjdbc.entiites.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
		
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	EmpRowMapper empRowMapper;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}

	public int saveEmployee(Employee e)
	{
		 String query ="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
			    return jdbcTemplate.update(query);  
	}
	
	public int updateEmployee(Employee e){  
		String query ="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
		String  query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}

	public Employee getEmployee(int empId) {
		String query = "select * from employee where id=?";
		Employee emp = this.jdbcTemplate.queryForObject(query,empRowMapper,empId);
		return emp;
		
	}

	public List<Employee> getEmployees() {
		
		String query = "select * from employee";
		List<Employee> emps = this.jdbcTemplate.query(query,empRowMapper);
		return emps;
	}  
	
	
	
}
