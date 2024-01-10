package org.jsp.SpringOrm;

import org.jsp.SpringOrm.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("file.xml");
		StudentDao st = ac.getBean("studentDao", StudentDao.class);
		Student s = new Student(127, "Ayush", "NEW DELHI");
		int r = st.insert(s);
		System.out.println(r);
		StudentDao p=ac.getBean("studentDao",StudentDao.class);
		Student p1=new Student(127,"Anagha","London");
      	p.Update(p1);
      	StudentDao k=ac.getBean("studentDao",StudentDao.class);
      	 Student dt=k.Fetch(12);
      	 System.out.println(dt);
        StudentDao pk=ac.getBean("studentDao",StudentDao.class);
        pk.Delete(12);
        
		
		
		
		
	}
}
