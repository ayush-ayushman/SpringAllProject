package org.jsp.Orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveUser {
  public static void main(String[] args) {
	User u=new User();
	u.setName("Ayush Ayushman");
	u.setPhone(4566789);
	u.setPassword("vtubit7");
	ApplicationContext con=new ClassPathXmlApplicationContext("FILE.XML");
	UserDao dao=con.getBean(UserDao.class);
	dao.saveUser(u);
}
}
