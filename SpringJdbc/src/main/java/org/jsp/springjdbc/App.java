package org.jsp.springjdbc;

import java.util.Iterator;
import java.util.List;

import org.jsp.springjdbc.dao.StudentDao;
import org.jsp.springjdbc.dao.StudentDaoImpl;
import org.jsp.springjdbc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext com=new AnnotationConfigApplicationContext(JdbcConfig.class);
    JdbcTemplate tem=com.getBean(JdbcTemplate.class);
      String query="insert into student(id,name,city) values(?,?,?)";
      int update = tem.update(query,456,"Ayush","Bengalueu");
     StudentDao st= com.getBean(StudentDao.class);
   // Student s=new Student();
    // s.setId(78);
    // s.setName("Ayushman");
   //  s.setCity("Bhopal");
   //  int ip = st.insert(s);
   //  System.out.println(ip);
    /*  Student st1=new Student();
   //   st1.setId(78);
    //  st1.setName("Anagha");
   //   st1.setCity("London");
   //   int change = st.change(st1);
   //   System.out.println(change); */
  //    int f=st.delete(78);
   //   System.out.println(f);
   // Student sto= st.getStudentId(456);
    //System.out.println(sto);
   List<Student> pt=  st.getAllStudents();
   for (Student student : pt) {
	System.out.println(student);
}
     
     
      
      
        
    }
}
