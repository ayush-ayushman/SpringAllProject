package org.jsp.SpringOrm.dao;

import org.jsp.SpringOrm.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {
		int i = (int) hibernateTemplate.save(student);
		return i;

	}

	@Transactional
	public void Update(Student student) {
		hibernateTemplate.update(student);

	}

	@Transactional
	public Student Fetch(int p) {
	  Student student=this.hibernateTemplate.get(Student.class,p);
	return student;
	}
	@Transactional
	public void Delete(int p2)
	{
		Student student=this.hibernateTemplate.get(Student.class,p2);
		this.hibernateTemplate.delete(student);
	}

}
