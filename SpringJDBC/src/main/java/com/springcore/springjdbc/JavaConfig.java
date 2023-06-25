package com.springcore.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.springjdbc.dao.EmployeeDao;
import com.springcore.springjdbc.dao.EmployeeDaoImpl;

@Configuration
//@ComponentScan(basePackages = {"com.springcore.springjdbc"})
public class JavaConfig 
{

	@Bean(name={"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("admin");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		return ds;
		
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;	
	}
	
	@Bean(name = {"employeeDao"})
	public EmployeeDao getEmployeeDao()
	{
		EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
		empDaoImpl.setJdbcTemplate(getJdbcTemplate());
		return empDaoImpl;
		
	}
}
