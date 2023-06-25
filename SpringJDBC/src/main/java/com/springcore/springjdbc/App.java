package com.springcore.springjdbc;

import java.util.List;

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
    Student s = new Student(112,"Dynamic","Modinagar");
    StudentDao sdao =  (StudentDao) context.getBean("sdao");

//    create query...
//    System.out.println(sdao.saveStudent(s));
    
//    delete query...
//    System.out.println(sdao.deleteStudent(s));

//    update query...
//    System.out.println(sdao.updateStudent(s));
    
//    gete query..
      System.out.println("Getting single student form the database...");
      System.out.println(sdao.getStudent(112));

//   get all data...
      System.out.println("\nGetting all data form the Student Database...\n");
      List<Student> students = sdao.getAllStudents();
      for(Student s1 : students)
      {
    	  System.out.println(s1);
      }
//      System.out.println(sdao.getAllStudents());
    }
}
