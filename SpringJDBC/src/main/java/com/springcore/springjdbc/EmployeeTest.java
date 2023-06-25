package com.springcore.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springjdbc.dao.EmployeeDao;
import com.springcore.springjdbc.dao.EmployeeDaoImpl;
import com.springcore.springjdbc.entiites.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("com/springcore/springjdbc/Config.xml");
//		EmployeeDaoImpl edao = context.getBean("edao",EmployeeDaoImpl.class);
//		int status = edao.saveEmployee(new Employee(104,"mno",50100));
//		int status = edao.deleteEmployee(new Employee(103,"Abcs",25000));
//		System.out.println(status);
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		@Autowired
//		EmployeeDaoImpl emp ;
     	EmployeeDaoImpl emp = (EmployeeDaoImpl) context.getBean("employeeDao");
		int status = emp.saveEmployee(new Employee(111,"Shoyab",50500));
//		int status = edao.deleteEmployee(new Employee(103,"Abcs",25000));
     	System.out.println(status);
		
	}

}
