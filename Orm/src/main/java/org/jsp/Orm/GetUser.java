package org.jsp.Orm;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetUser {
	public static void main(String[] args) {
		 ApplicationContext con=new ClassPathXmlApplicationContext("File.xml");
	     UserDao dao=con.getBean(UserDao.class);
	      List<User> p=dao.getAllUsers();
	      for(User k:p)
	      {
	    	  System.out.println(k);
	      }
	     
	}
}
