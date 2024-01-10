package org.jsp.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jsp.springjdbc.entity.Student;
import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu=new Student();
		stu.setId(rs.getInt(1));
		stu.setName(rs.getString(2));
		stu.setCity(rs.getString(3));
		return stu;
	}

}
