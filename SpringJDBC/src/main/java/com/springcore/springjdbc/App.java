package com.springcore.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springjdbc.dao.StudentDao;
import com.springcore.springjdbc.entiites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// first approach...
    	
//      ApplicationContext context = 
//    		  new ClassPathXmlApplicationContext("com/springcore/springjdbc/Config.xml");
//      JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class);    
    	
//    insert query
//      String query = "insert into student(id,name,city) values(?,?,?)";
      
//    fire query  
//      int result = template.update(query,3,"Aman","Modinagar");
//      System.out.println("Number of rows inserted: "+result);
      
    ApplicationContext context = 
    		new ClassPathXmlApplicationContext("com/springcore/springjdbc/Config.xml");
    Student s = new Student(112,"Dynamic","Faridabad");
    StudentDao sdao =  (StudentDao) context.getBean("sdao");
//    System.out.println(sdao.saveStudent(s));
//    System.out.println(sdao.deleteStudent(s));
    System.out.println(sdao.updateStudent(s));
    	
    }
}
