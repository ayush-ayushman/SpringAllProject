package org.jsp.Orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateUser {
	public static void main(String[] args) {
		User us=new User();
		us.setName("Rita Kumar");
		us.setPhone(7895666);
		us.setPassword("vtubit7");
        us.setId(0);
		ApplicationContext context=new ClassPathXmlApplicationContext("File.xml");
		UserDao dao=context.getBean(UserDao.class);
		dao.updateUser(us);
		
		
	}

}
