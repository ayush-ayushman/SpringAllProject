package org.jsp.Orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class fetchById {
	public static void main(String[] args) {
		
	      ApplicationContext con=new ClassPathXmlApplicationContext("File.xml");
	      UserDao dao=con.getBean(UserDao.class);
	       User p=dao.getUserById(0);
	       System.out.println(p);
	       
	      
			
		}
}
