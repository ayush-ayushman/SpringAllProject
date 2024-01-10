package org.jsp.springjdbc.dao;

import java.util.List;

import org.jsp.springjdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getStudentId(int studentId);
	public List<Student> getAllStudents();

}
