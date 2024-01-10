package org.jsp.springjdbc.dao;

import java.util.List;

import org.jsp.springjdbc.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemp;

	@Override
	public int insert(Student student) {
	String query="insert into student(id,name,city) values(?,?,?)";
	int r = this.jdbcTemp.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}

	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}

	@Override
	public int change(Student student) {
		String query="update student set name=? ,city=? where id=?";
		int u = jdbcTemp.update(query,student.getName(),student.getCity(),student.getId());
		return u;
	}

	@Override
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int e = jdbcTemp.update(query,studentId);
		return e;
	}

	@Override
	public Student getStudentId(int studentId) {
		String query="select * from  student where id=?";
		RowMapper <Student>rowMapper=new RowMapperImpl();
	   Student student=jdbcTemp.queryForObject(query,rowMapper,studentId );
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> student = jdbcTemp.query(query,new RowMapperImpl());
		return student;
	}
	
	
	

	
	

}
