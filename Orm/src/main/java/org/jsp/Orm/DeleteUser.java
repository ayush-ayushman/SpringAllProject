package org.jsp.Orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DeleteUser {
	public static void main(String[] args) {
		 ApplicationContext con=new ClassPathXmlApplicationContext("File.xml");
	      UserDao dao=con.getBean(UserDao.class);
	     boolean t= dao.deleteUser(0);
	     System.out.println(t);
	}

}
